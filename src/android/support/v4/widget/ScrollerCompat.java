package android.support.v4.widget;

import android.content.Context;
import android.os.Build.VERSION;
import android.view.animation.Interpolator;

public class ScrollerCompat
{
  static final ScrollerCompat.ScrollerCompatImpl IMPL = new ScrollerCompat.ScrollerCompatImplBase();
  Object mScroller;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 14)
    {
      IMPL = new ScrollerCompat.ScrollerCompatImplIcs();
      return;
    }
    if (i >= 9)
    {
      IMPL = new ScrollerCompat.ScrollerCompatImplGingerbread();
      return;
    }
  }
  
  ScrollerCompat(Context paramContext, Interpolator paramInterpolator)
  {
    mScroller = IMPL.createScroller(paramContext, paramInterpolator);
  }
  
  public static ScrollerCompat create(Context paramContext)
  {
    return create(paramContext, null);
  }
  
  public static ScrollerCompat create(Context paramContext, Interpolator paramInterpolator)
  {
    return new ScrollerCompat(paramContext, paramInterpolator);
  }
  
  public void abortAnimation()
  {
    IMPL.abortAnimation(mScroller);
  }
  
  public boolean computeScrollOffset()
  {
    return IMPL.computeScrollOffset(mScroller);
  }
  
  public void fling(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    IMPL.fling(mScroller, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8);
  }
  
  public void fling(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10)
  {
    IMPL.fling(mScroller, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6, paramInt7, paramInt8, paramInt9, paramInt10);
  }
  
  public float getCurrVelocity()
  {
    return IMPL.getCurrVelocity(mScroller);
  }
  
  public int getCurrX()
  {
    return IMPL.getCurrX(mScroller);
  }
  
  public int getCurrY()
  {
    return IMPL.getCurrY(mScroller);
  }
  
  public int getFinalX()
  {
    return IMPL.getFinalX(mScroller);
  }
  
  public int getFinalY()
  {
    return IMPL.getFinalY(mScroller);
  }
  
  public boolean isFinished()
  {
    return IMPL.isFinished(mScroller);
  }
  
  public boolean isOverScrolled()
  {
    return IMPL.isOverScrolled(mScroller);
  }
  
  public void notifyHorizontalEdgeReached(int paramInt1, int paramInt2, int paramInt3)
  {
    IMPL.notifyHorizontalEdgeReached(mScroller, paramInt1, paramInt2, paramInt3);
  }
  
  public void notifyVerticalEdgeReached(int paramInt1, int paramInt2, int paramInt3)
  {
    IMPL.notifyVerticalEdgeReached(mScroller, paramInt1, paramInt2, paramInt3);
  }
  
  public void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    IMPL.startScroll(mScroller, paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public void startScroll(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    IMPL.startScroll(mScroller, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
}

/* Location:
 * Qualified Name:     android.support.v4.widget.ScrollerCompat
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */