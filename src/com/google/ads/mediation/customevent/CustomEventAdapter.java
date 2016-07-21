package com.google.ads.mediation.customevent;

import android.view.View;
import com.google.ads.mediation.j;
import com.google.ads.mediation.l;
import com.google.android.gms.ads.mediation.customevent.CustomEventExtras;
import com.google.android.gms.internal.zzin;

public final class CustomEventAdapter
  implements j, l
{
  c a;
  d b;
  private View c;
  
  private static Object a(String paramString)
  {
    try
    {
      Object localObject = Class.forName(paramString).newInstance();
      return localObject;
    }
    catch (Throwable localThrowable)
    {
      zzin.zzaK("Could not instantiate custom event adapter: " + paramString + ". " + localThrowable.getMessage());
    }
    return null;
  }
  
  public final void a()
  {
    Object localObject;
    if (a != null) {
      localObject = a;
    }
    if (b != null) {
      localObject = b;
    }
  }
  
  public final Class b()
  {
    return CustomEventExtras.class;
  }
  
  public final Class c()
  {
    return e.class;
  }
  
  public final View d()
  {
    return c;
  }
  
  public final void e()
  {
    d locald = b;
  }
}

/* Location:
 * Qualified Name:     com.google.ads.mediation.customevent.CustomEventAdapter
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */