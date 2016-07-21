package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.media.AudioManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.DetailedState;
import android.net.Uri;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import com.google.android.gms.ads.internal.client.zzn;
import com.google.android.gms.ads.internal.util.client.zza;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.common.zze;
import java.util.Locale;

public final class zzhj$zza
{
  private int zzHD;
  private int zzHE;
  private float zzHF;
  private int zzJQ;
  private boolean zzJR;
  private boolean zzJS;
  private String zzJT;
  private String zzJU;
  private boolean zzJV;
  private boolean zzJW;
  private boolean zzJX;
  private boolean zzJY;
  private String zzJZ;
  private String zzKa;
  private int zzKb;
  private int zzKc;
  private int zzKd;
  private int zzKe;
  private int zzKf;
  private int zzKg;
  private double zzKh;
  private boolean zzKi;
  private boolean zzKj;
  private int zzKk;
  private String zzKl;
  
  public zzhj$zza(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    zzB(paramContext);
    zza(paramContext, localPackageManager);
    zzC(paramContext);
    Locale localLocale = Locale.getDefault();
    boolean bool1;
    if (zza(localPackageManager, "geo:0,0?q=donuts") != null)
    {
      bool1 = true;
      zzJR = bool1;
      if (zza(localPackageManager, "http://www.google.com") == null) {
        break label128;
      }
      bool1 = bool2;
      label63:
      zzJS = bool1;
      zzJU = localLocale.getCountry();
      zzJV = zzn.zzcS().zzhI();
      zzJW = zze.zzap(paramContext);
      zzJZ = localLocale.getLanguage();
      zzKa = zza(localPackageManager);
      paramContext = paramContext.getResources();
      if (paramContext != null) {
        break label133;
      }
    }
    label128:
    label133:
    do
    {
      return;
      bool1 = false;
      break;
      bool1 = false;
      break label63;
      paramContext = paramContext.getDisplayMetrics();
    } while (paramContext == null);
    zzHF = density;
    zzHD = widthPixels;
    zzHE = heightPixels;
  }
  
  public zzhj$zza(Context paramContext, zzhj paramzzhj)
  {
    PackageManager localPackageManager = paramContext.getPackageManager();
    zzB(paramContext);
    zza(paramContext, localPackageManager);
    zzC(paramContext);
    zzD(paramContext);
    zzJR = zzJR;
    zzJS = zzJS;
    zzJU = zzJU;
    zzJV = zzJV;
    zzJW = zzJW;
    zzJZ = zzJZ;
    zzKa = zzKa;
    zzHF = zzHF;
    zzHD = zzHD;
    zzHE = zzHE;
  }
  
  private void zzB(Context paramContext)
  {
    paramContext = (AudioManager)paramContext.getSystemService("audio");
    zzJQ = paramContext.getMode();
    zzJX = paramContext.isMusicActive();
    zzJY = paramContext.isSpeakerphoneOn();
    zzKb = paramContext.getStreamVolume(3);
    zzKf = paramContext.getRingerMode();
    zzKg = paramContext.getStreamVolume(2);
  }
  
  private void zzC(Context paramContext)
  {
    boolean bool = false;
    paramContext = paramContext.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    if (paramContext != null)
    {
      int i = paramContext.getIntExtra("status", -1);
      int j = paramContext.getIntExtra("level", -1);
      int k = paramContext.getIntExtra("scale", -1);
      zzKh = (j / k);
      if ((i == 2) || (i == 5)) {
        bool = true;
      }
      zzKi = bool;
      return;
    }
    zzKh = -1.0D;
    zzKi = false;
  }
  
  private void zzD(Context paramContext)
  {
    zzKl = Build.FINGERPRINT;
  }
  
  private static ResolveInfo zza(PackageManager paramPackageManager, String paramString)
  {
    return paramPackageManager.resolveActivity(new Intent("android.intent.action.VIEW", Uri.parse(paramString)), 65536);
  }
  
  private static String zza(PackageManager paramPackageManager)
  {
    Object localObject = zza(paramPackageManager, "market://details?id=com.google.android.gms.ads");
    if (localObject == null) {}
    for (;;)
    {
      return null;
      localObject = activityInfo;
      if (localObject != null) {
        try
        {
          paramPackageManager = paramPackageManager.getPackageInfo(packageName, 0);
          if (paramPackageManager != null)
          {
            paramPackageManager = versionCode + "." + packageName;
            return paramPackageManager;
          }
        }
        catch (PackageManager.NameNotFoundException paramPackageManager) {}
      }
    }
    return null;
  }
  
  private void zza(Context paramContext, PackageManager paramPackageManager)
  {
    TelephonyManager localTelephonyManager = (TelephonyManager)paramContext.getSystemService("phone");
    ConnectivityManager localConnectivityManager = (ConnectivityManager)paramContext.getSystemService("connectivity");
    zzJT = localTelephonyManager.getNetworkOperator();
    zzKd = localTelephonyManager.getNetworkType();
    zzKe = localTelephonyManager.getPhoneType();
    zzKc = -2;
    zzKj = false;
    zzKk = -1;
    if (zzr.zzbC().zza(paramPackageManager, paramContext.getPackageName(), "android.permission.ACCESS_NETWORK_STATE"))
    {
      paramContext = localConnectivityManager.getActiveNetworkInfo();
      if (paramContext == null) {
        break label128;
      }
      zzKc = paramContext.getType();
      zzKk = paramContext.getDetailedState().ordinal();
    }
    for (;;)
    {
      if (Build.VERSION.SDK_INT >= 16) {
        zzKj = localConnectivityManager.isActiveNetworkMetered();
      }
      return;
      label128:
      zzKc = -1;
    }
  }
  
  public final zzhj zzgI()
  {
    return new zzhj(zzJQ, zzJR, zzJS, zzJT, zzJU, zzJV, zzJW, zzJX, zzJY, zzJZ, zzKa, zzKb, zzKc, zzKd, zzKe, zzKf, zzKg, zzHF, zzHD, zzHE, zzKh, zzKi, zzKj, zzKk, zzKl);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzhj.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */