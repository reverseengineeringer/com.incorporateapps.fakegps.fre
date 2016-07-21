package com.google.ads;

import com.google.android.gms.ads.AdSize;

public final class d
{
  public static final d a = new d(-1, -2);
  public static final d b = new d(320, 50);
  public static final d c = new d(300, 250);
  public static final d d = new d(468, 60);
  public static final d e = new d(728, 90);
  public static final d f = new d(160, 600);
  private final AdSize g;
  
  private d(int paramInt1, int paramInt2)
  {
    this(new AdSize(paramInt1, paramInt2));
  }
  
  public d(AdSize paramAdSize)
  {
    g = paramAdSize;
  }
  
  public final int a()
  {
    return g.getWidth();
  }
  
  public final int b()
  {
    return g.getHeight();
  }
  
  public final boolean equals(Object paramObject)
  {
    if (!(paramObject instanceof d)) {
      return false;
    }
    paramObject = (d)paramObject;
    return g.equals(g);
  }
  
  public final int hashCode()
  {
    return g.hashCode();
  }
  
  public final String toString()
  {
    return g.toString();
  }
}

/* Location:
 * Qualified Name:     com.google.ads.d
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */