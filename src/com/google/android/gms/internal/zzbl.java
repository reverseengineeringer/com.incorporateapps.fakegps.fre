package com.google.android.gms.internal;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Environment;
import com.google.android.gms.common.internal.zzx;
import java.util.List;

public class zzbl
{
  private final Context mContext;
  
  public zzbl(Context paramContext)
  {
    zzx.zzb(paramContext, "Context can not be null");
    mContext = paramContext;
  }
  
  public static boolean zzdn()
  {
    return "mounted".equals(Environment.getExternalStorageState());
  }
  
  public boolean zza(Intent paramIntent)
  {
    boolean bool = false;
    zzx.zzb(paramIntent, "Intent can not be null");
    if (!mContext.getPackageManager().queryIntentActivities(paramIntent, 0).isEmpty()) {
      bool = true;
    }
    return bool;
  }
  
  public boolean zzdj()
  {
    Intent localIntent = new Intent("android.intent.action.DIAL");
    localIntent.setData(Uri.parse("tel:"));
    return zza(localIntent);
  }
  
  public boolean zzdk()
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setData(Uri.parse("sms:"));
    return zza(localIntent);
  }
  
  public boolean zzdl()
  {
    return (zzdn()) && (mContext.checkCallingOrSelfPermission("android.permission.WRITE_EXTERNAL_STORAGE") == 0);
  }
  
  public boolean zzdm()
  {
    return true;
  }
  
  public boolean zzdo()
  {
    Intent localIntent = new Intent("android.intent.action.INSERT").setType("vnd.android.cursor.dir/event");
    return (Build.VERSION.SDK_INT >= 14) && (zza(localIntent));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzbl
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */