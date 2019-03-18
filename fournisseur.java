package CarreTriangleRond;

public class Fournisseur extends Activity {

	@Override
	public void onCreate(){
		db=(new DatabaseHelper(getContext())).getWritableDatabase();
		return (db == null) ? false : true;
	}
	
	@Override
	public Cursor query(Uri url, String[] projection, String Selection, String[] selectionArgs, String sort){
		SQLiteQueryBuilder qb = new SQLiteQueryBuilder();
		qb.setTables(getTableName());
		if(isCollectionUri(url)){qb.setProjectionMap(getDefaultProjection());}
		else { qb.appendWhere (getIdColumnName()+"="+url.getPathSegments().get(1)); }
		String orderBy;
		if (TextUtils.isEmpty(sort)){ orderBy=getDefaultSortOrder();}
		else { orderBy=sort; }
		Cursor c = qb.query(db, projection, selection, selectionArgs, null, null, orderBy);
		c.setNotificationUri(getContext().getContentResolver(), url);
		return c;
		}
	@Override
	public Uri insert(Uri url, ContentValues initialValues){
		long rowID;
		ContentValues values;
		
		if (initialValues != null){
			values=new ContentValues(initialValues);
		}
		else {
			values = new ContentValues();
		}
		
		if (!isCollectionUri(url)){
			throw new IllegalArgumentException("URL inconnue "+ url);
		}
		
		for (String colName : getRequiredColumns()){
			if (values.containsKey(colName) == false){
				throw new IllegalArgumentException("Colonne manquante : "+colName);
			}
		}
		
		populateDefaultValues(values);
		
		rowID=db.insert(getTableName(), getNullColumnHack(), values);
		if (rowID>0){
			Uri uri=ContentUris.withAppenedId(getContentUri, rowID);
			getContext().getContentResolver().notifyChange(uri, null);
			return uri;
		}
		throw new SQLException("Echec "+url );
	}
}

@Override
public int update(Uri url, ContentValues values, String where, String[] whereArgs){
	int count;
	if (isCollectionUri(url)){
		count=db.update(getTableName(), values, where, whereArgs);
	}
	else {
		String segment=url.getPathSegments().get(1);
		count=db
				.update(getTableName(), values, getIdColumnName() + "="
					+ segment
					+ (!TextUtils.isEmpty(where)) ? " AND ( " + where, whereArgs);
	}
	getContext().getContentResolver().notifyChange(url, null);
	return count;
	}
}

@Override
public int delete(Uri url, String where, String[] whereArgs){
	int count;
	long rowId=0;
	
	if(isCollectionUri(url)){
		count=db.delete(getTableName(), where, whereArgs);}
	
	else{
		String segment = url.getPathSegments().get(1);
		rowId=Long.parseLong(segment);
		count=db
			.delete(getTableName(), getIdcolumnName() + "="
				+segment
				+(!TextUtils.isEmpty(where) ? "AND ( "+ where, whereArgs);
	}
	getContext().getContentResolver().notifyChange(url, null);
	return count;
	}
	
@Override
public String getType(Uri url){
	if (isCollectionUri(url)){
		return (getCollectionType());}
		return (getSingleType());
	private String getCollectionType(){
		return ("vnd.android.cursor.dir/vnd.commonsware.constant");
	}
	private String getSingleType(){
		return ("vnd.android.cursor.item/vnd.commonsware.constant");
	}
		}
