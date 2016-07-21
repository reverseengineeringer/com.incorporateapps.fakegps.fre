package com.google.android.gms.drive;

import android.text.TextUtils;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.drive.internal.zzu;

public class ExecutionOptions
{
  public static final int CONFLICT_STRATEGY_KEEP_REMOTE = 1;
  public static final int CONFLICT_STRATEGY_OVERWRITE_REMOTE = 0;
  public static final int MAX_TRACKING_TAG_STRING_LENGTH = 65536;
  private final String zzaoV;
  private final boolean zzaoW;
  private final int zzaoX;
  
  public ExecutionOptions(String paramString, boolean paramBoolean, int paramInt)
  {
    zzaoV = paramString;
    zzaoW = paramBoolean;
    zzaoX = paramInt;
  }
  
  public static boolean zzcX(String paramString)
  {
    return (!TextUtils.isEmpty(paramString)) && (paramString.length() <= 65536);
  }
  
  public static boolean zzcv(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean zzcw(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  public boolean equals(Object paramObject)
  {
    boolean bool2 = true;
    boolean bool1;
    if ((paramObject == null) || (paramObject.getClass() != getClass())) {
      bool1 = false;
    }
    do
    {
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramObject == this);
      paramObject = (ExecutionOptions)paramObject;
      if ((!zzw.equal(zzaoV, zzaoV)) || (zzaoX != zzaoX)) {
        break;
      }
      bool1 = bool2;
    } while (zzaoW == zzaoW);
    return false;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzaoV, Integer.valueOf(zzaoX), Boolean.valueOf(zzaoW) });
  }
  
  public void zzg(GoogleApiClient paramGoogleApiClient)
  {
    paramGoogleApiClient = (zzu)paramGoogleApiClient.zza(Drive.zzUI);
    if ((zzsC()) && (!paramGoogleApiClient.zzti())) {
      throw new IllegalStateException("Application must define an exported DriveEventService subclass in AndroidManifest.xml to be notified on completion");
    }
  }
  
  public String zzsB()
  {
    return zzaoV;
  }
  
  public boolean zzsC()
  {
    return zzaoW;
  }
  
  public int zzsD()
  {
    return zzaoX;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.drive.ExecutionOptions
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */