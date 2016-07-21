package com.incorporateapps.fakegps.fre;

import android.view.View;
import android.view.View.OnClickListener;

final class ae
  implements View.OnClickListener
{
  ae(Maps paramMaps) {}
  
  public final void onClick(View paramView)
  {
    a.stopService(a.q);
    if ((a.y > 4) && (a.y % 3 == 0))
    {
      Maps.p(a);
      a.x = false;
      a.w = false;
    }
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.ae
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */