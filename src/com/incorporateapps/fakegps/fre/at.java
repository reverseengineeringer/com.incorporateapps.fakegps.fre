package com.incorporateapps.fakegps.fre;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;

public class at
  extends Thread
{
  private static final String g = at.class.getSimpleName();
  protected int a = 300;
  protected float b = 0.0F;
  protected int c = 2000;
  double d;
  double e;
  Handler f = new Handler();
  private Context h;
  private LocationManager i;
  private Runnable j = new au(this);
  
  public at(Context paramContext)
  {
    h = paramContext;
  }
  
  public final void a()
  {
    if (j != null) {
      f.removeCallbacks(j);
    }
    try
    {
      i.removeTestProvider("gps");
      i.removeTestProvider("network");
      return;
    }
    catch (Exception localException) {}
  }
  
  public final void a(double paramDouble1, double paramDouble2)
  {
    d = paramDouble1;
    e = paramDouble2;
    if (j != null) {
      f.removeCallbacks(j);
    }
    f.post(j);
  }
}

/* Location:
 * Qualified Name:     com.incorporateapps.fakegps.fre.at
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */