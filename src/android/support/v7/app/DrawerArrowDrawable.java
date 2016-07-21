package android.support.v7.app;

import android.content.Context;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Join;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.v7.appcompat.R.attr;
import android.support.v7.appcompat.R.style;
import android.support.v7.appcompat.R.styleable;

abstract class DrawerArrowDrawable
  extends Drawable
{
  private static final float ARROW_HEAD_ANGLE = (float)Math.toRadians(45.0D);
  private final float mBarGap;
  private final float mBarSize;
  private final float mBarThickness;
  private final float mMiddleArrowSize;
  private final Paint mPaint = new Paint();
  private final Path mPath = new Path();
  private float mProgress;
  private final int mSize;
  private final boolean mSpin;
  private final float mTopBottomArrowSize;
  private boolean mVerticalMirror = false;
  
  DrawerArrowDrawable(Context paramContext)
  {
    paramContext = paramContext.getTheme().obtainStyledAttributes(null, R.styleable.DrawerArrowToggle, R.attr.drawerArrowStyle, R.style.Base_Widget_AppCompat_DrawerArrowToggle);
    mPaint.setAntiAlias(true);
    mPaint.setColor(paramContext.getColor(R.styleable.DrawerArrowToggle_color, 0));
    mSize = paramContext.getDimensionPixelSize(R.styleable.DrawerArrowToggle_drawableSize, 0);
    mBarSize = paramContext.getDimension(R.styleable.DrawerArrowToggle_barSize, 0.0F);
    mTopBottomArrowSize = paramContext.getDimension(R.styleable.DrawerArrowToggle_topBottomBarArrowSize, 0.0F);
    mBarThickness = paramContext.getDimension(R.styleable.DrawerArrowToggle_thickness, 0.0F);
    mBarGap = paramContext.getDimension(R.styleable.DrawerArrowToggle_gapBetweenBars, 0.0F);
    mSpin = paramContext.getBoolean(R.styleable.DrawerArrowToggle_spinBars, true);
    mMiddleArrowSize = paramContext.getDimension(R.styleable.DrawerArrowToggle_middleBarArrowSize, 0.0F);
    paramContext.recycle();
    mPaint.setStyle(Paint.Style.STROKE);
    mPaint.setStrokeJoin(Paint.Join.ROUND);
    mPaint.setStrokeCap(Paint.Cap.SQUARE);
    mPaint.setStrokeWidth(mBarThickness);
  }
  
  private static float lerp(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    return (paramFloat2 - paramFloat1) * paramFloat3 + paramFloat1;
  }
  
  public void draw(Canvas paramCanvas)
  {
    Rect localRect = getBounds();
    boolean bool = isLayoutRtl();
    float f3 = lerp(mBarSize, mTopBottomArrowSize, mProgress);
    float f5 = lerp(mBarSize, mMiddleArrowSize, mProgress);
    float f6 = lerp(0.0F, mBarThickness / 2.0F, mProgress);
    float f4 = lerp(0.0F, ARROW_HEAD_ANGLE, mProgress);
    float f1;
    float f2;
    label92:
    int i;
    if (bool)
    {
      f1 = 0.0F;
      if (!bool) {
        break label347;
      }
      f2 = 180.0F;
      f1 = lerp(f1, f2, mProgress);
      f2 = lerp(mBarGap + mBarThickness, 0.0F, mProgress);
      mPath.rewind();
      float f7 = -f5 / 2.0F;
      mPath.moveTo(f7 + f6, 0.0F);
      mPath.rLineTo(f5 - f6, 0.0F);
      f5 = (float)Math.round(f3 * Math.cos(f4));
      double d = f3;
      f3 = (float)Math.round(Math.sin(f4) * d);
      mPath.moveTo(f7, f2);
      mPath.rLineTo(f5, f3);
      mPath.moveTo(f7, -f2);
      mPath.rLineTo(f5, -f3);
      mPath.moveTo(0.0F, 0.0F);
      mPath.close();
      paramCanvas.save();
      if (!mSpin) {
        break label359;
      }
      if (!(mVerticalMirror ^ bool)) {
        break label353;
      }
      i = -1;
      label285:
      paramCanvas.rotate(i * f1, localRect.centerX(), localRect.centerY());
    }
    for (;;)
    {
      paramCanvas.translate(localRect.centerX(), localRect.centerY());
      paramCanvas.drawPath(mPath, mPaint);
      paramCanvas.restore();
      return;
      f1 = -180.0F;
      break;
      label347:
      f2 = 0.0F;
      break label92;
      label353:
      i = 1;
      break label285;
      label359:
      if (bool) {
        paramCanvas.rotate(180.0F, localRect.centerX(), localRect.centerY());
      }
    }
  }
  
  public int getIntrinsicHeight()
  {
    return mSize;
  }
  
  public int getIntrinsicWidth()
  {
    return mSize;
  }
  
  public int getOpacity()
  {
    return -3;
  }
  
  public float getProgress()
  {
    return mProgress;
  }
  
  public boolean isAutoMirrored()
  {
    return true;
  }
  
  abstract boolean isLayoutRtl();
  
  public void setAlpha(int paramInt)
  {
    mPaint.setAlpha(paramInt);
  }
  
  public void setColorFilter(ColorFilter paramColorFilter)
  {
    mPaint.setColorFilter(paramColorFilter);
  }
  
  public void setProgress(float paramFloat)
  {
    mProgress = paramFloat;
    invalidateSelf();
  }
  
  protected void setVerticalMirror(boolean paramBoolean)
  {
    mVerticalMirror = paramBoolean;
  }
}

/* Location:
 * Qualified Name:     android.support.v7.app.DrawerArrowDrawable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */