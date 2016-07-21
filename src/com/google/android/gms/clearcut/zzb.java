package com.google.android.gms.clearcut;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.util.Log;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.Api.zza;
import com.google.android.gms.common.api.Api.zzc;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzlv;
import com.google.android.gms.internal.zzmq;
import com.google.android.gms.internal.zzmt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;

public final class zzb
{
  public static final Api API = new Api("ClearcutLogger.API", zzUJ, zzUI);
  public static final Api.zzc zzUI = new Api.zzc();
  public static final Api.zza zzUJ = new zzb.1();
  public static final zzc zzaeQ = new zzlv();
  private final Context mContext;
  private final String zzTJ;
  private final int zzaeR;
  private String zzaeS;
  private int zzaeT = -1;
  private String zzaeU;
  private String zzaeV;
  private final boolean zzaeW;
  private int zzaeX = 0;
  private final zzc zzaeY;
  private final zza zzaeZ;
  private zzb.zzc zzafa;
  private final zzmq zzqW;
  
  public zzb(Context paramContext, int paramInt, String paramString1, String paramString2, String paramString3, boolean paramBoolean, zzc paramzzc, zzmq paramzzmq, zzb.zzc paramzzc1, zza paramzza)
  {
    Context localContext = paramContext.getApplicationContext();
    if (localContext != null)
    {
      mContext = localContext;
      zzTJ = paramContext.getPackageName();
      zzaeR = zzai(paramContext);
      zzaeT = paramInt;
      zzaeS = paramString1;
      zzaeU = paramString2;
      zzaeV = paramString3;
      zzaeW = paramBoolean;
      zzaeY = paramzzc;
      zzqW = paramzzmq;
      if (paramzzc1 == null) {
        break label141;
      }
      label93:
      zzafa = paramzzc1;
      zzaeZ = paramzza;
      zzaeX = 0;
      if (zzaeW) {
        if (zzaeU != null) {
          break label153;
        }
      }
    }
    label141:
    label153:
    for (paramBoolean = true;; paramBoolean = false)
    {
      zzx.zzb(paramBoolean, "can't be anonymous with an upload account");
      return;
      localContext = paramContext;
      break;
      paramzzc1 = new zzb.zzc();
      break label93;
    }
  }
  
  public zzb(Context paramContext, String paramString1, String paramString2, String paramString3)
  {
    this(paramContext, -1, paramString1, paramString2, paramString3, false, zzaeQ, zzmt.zzsc(), null, zza.zzaeP);
  }
  
  private int zzai(Context paramContext)
  {
    try
    {
      int i = getPackageManagergetPackageInfogetPackageName0versionCode;
      return i;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      Log.wtf("ClearcutLogger", "This can't happen.");
    }
    return 0;
  }
  
  private static int[] zzb(ArrayList paramArrayList)
  {
    if (paramArrayList == null) {
      return null;
    }
    int[] arrayOfInt = new int[paramArrayList.size()];
    paramArrayList = paramArrayList.iterator();
    int i = 0;
    while (paramArrayList.hasNext())
    {
      arrayOfInt[i] = ((Integer)paramArrayList.next()).intValue();
      i += 1;
    }
    return arrayOfInt;
  }
  
  public final boolean zza(GoogleApiClient paramGoogleApiClient, long paramLong, TimeUnit paramTimeUnit)
  {
    return zzaeY.zza(paramGoogleApiClient, paramLong, paramTimeUnit);
  }
  
  public final zzb.zza zzi(byte[] paramArrayOfByte)
  {
    return new zzb.zza(this, paramArrayOfByte, null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.clearcut.zzb
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */