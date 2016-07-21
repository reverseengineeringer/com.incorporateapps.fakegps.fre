package com.google.android.gms.gcm;

import android.os.Bundle;

public class zzd
{
  public static final zzd zzaMc = new zzd(0, 30, 3600);
  public static final zzd zzaMd = new zzd(1, 30, 3600);
  private final int zzaMe;
  private final int zzaMf;
  private final int zzaMg;
  
  private zzd(int paramInt1, int paramInt2, int paramInt3)
  {
    zzaMe = paramInt1;
    zzaMf = paramInt2;
    zzaMg = paramInt3;
  }
  
  public Bundle zzF(Bundle paramBundle)
  {
    paramBundle.putInt("retry_policy", zzaMe);
    paramBundle.putInt("initial_backoff_seconds", zzaMf);
    paramBundle.putInt("maximum_backoff_seconds", zzaMg);
    return paramBundle;
  }
  
  public int zzym()
  {
    return zzaMe;
  }
  
  public int zzyn()
  {
    return zzaMf;
  }
  
  public int zzyo()
  {
    return zzaMg;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.gcm.zzd
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */