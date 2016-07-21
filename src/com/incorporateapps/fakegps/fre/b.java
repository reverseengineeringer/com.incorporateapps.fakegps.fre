package com.incorporateapps.fakegps.fre;

import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;

final class b
  implements View.OnTouchListener
{
  b(BalloonItemizedOverlay paramBalloonItemizedOverlay, int paramInt) {}
  
  public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    paramView = ((View)paramView.getParent()).findViewById(2131361894).getBackground();
    if (paramMotionEvent.getAction() == 0)
    {
      if (paramView.setState(new int[] { 16842919 })) {
        paramView.invalidateSelf();
      }
      return true;
    }
    if (paramMotionEvent.getAction() == 1)
    {
      if (paramView.setState(new int[0])) {
        paramView.invalidateSelf();
      }
      a.b(b);
      return true;
    }
    return false;
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.b
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */