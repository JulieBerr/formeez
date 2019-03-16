package CarreTriangleRond;
public class CustodrawableView extends View {
  private ShapeDrawable drawable;

  public CustodrawableView(Context context) {
    super(context);

    int x = 10;
    int y = 10;
    int width = 300;
    int height = 50;

    drawable = new ShapeDrawable(new RectShape());
    // If the color isn't set, the shape uses black as the default.
    drawable.getPaint().setColor(0xff74AC23);
    // If the bounds aren't set, the shape can't be drawn.
    mDrawable.setBounds(x, y, x + width, y + height);
  }

  protected void onDraw(Canvas canvas) {
    mDrawable.draw(canvas);
  }
}
