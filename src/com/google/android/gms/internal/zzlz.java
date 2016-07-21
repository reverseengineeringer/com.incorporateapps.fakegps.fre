package com.google.android.gms.internal;

import android.os.Binder;

public abstract class zzlz
{
  private static zzlz.zza zzaiV = null;
  private static int zzaiW = 0;
  private static String zzaiX = "com.google.android.providers.gsf.permission.READ_GSERVICES";
  private static final Object zzqy = new Object();
  private Object zzSC = null;
  protected final String zzvs;
  protected final Object zzvt;
  
  protected zzlz(String paramString, Object paramObject)
  {
    zzvs = paramString;
    zzvt = paramObject;
  }
  
  public static boolean isInitialized()
  {
    return zzaiV != null;
  }
  
  public static zzlz zza(String paramString, Float paramFloat)
  {
    return new zzlz.4(paramString, paramFloat);
  }
  
  public static zzlz zza(String paramString, Integer paramInteger)
  {
    return new zzlz.3(paramString, paramInteger);
  }
  
  public static zzlz zza(String paramString, Long paramLong)
  {
    return new zzlz.2(paramString, paramLong);
  }
  
  public static zzlz zzk(String paramString, boolean paramBoolean)
  {
    return new zzlz.1(paramString, Boolean.valueOf(paramBoolean));
  }
  
  public static int zzpW()
  {
    return zzaiW;
  }
  
  public static zzlz zzv(String paramString1, String paramString2)
  {
    return new zzlz.5(paramString1, paramString2);
  }
  
  public final Object get()
  {
    if (zzSC != null) {
      return zzSC;
    }
    return zzct(zzvs);
  }
  
  protected abstract Object zzct(String paramString);
  
  public final Object zzpX()
  {
    long l = Binder.clearCallingIdentity();
    try
    {
      Object localObject1 = get();
      return localObject1;
    }
    finally
    {
      Binder.restoreCallingIdentity(l);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlz
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */