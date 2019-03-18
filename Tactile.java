public class EcranTactile extends Activity{
	
	@Override
	public boolean onTouchEvent(MotionEvent event){
		int action = event.getAction();
		switch (action) {
			case (MotionEvent.ACTION_DOWN)	:
				return true;
			case (MotionEvent.ACTION_UP)    :
				return true;
			default : return super.onTouchEvent(event);
		}
	}
	
}