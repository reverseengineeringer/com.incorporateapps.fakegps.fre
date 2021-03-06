package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzh
  extends zzak
{
  private static final String ID = zzad.zzbv.toString();
  private final Context mContext;
  
  public zzh(Context paramContext)
  {
    super(ID, new String[0]);
    mContext = paramContext;
  }
  
  public boolean zzFW()
  {
    return true;
  }
  
  public zzag.zza zzP(Map paramMap)
  {
    try
    {
      paramMap = zzdf.zzR(Integer.valueOf(mContext.getPackageManager().getPackageInfo(mContext.getPackageName(), 0).versionCode));
      return paramMap;
    }
    catch (PackageManager.NameNotFoundException paramMap)
    {
      zzbg.e("Package name " + mContext.getPackageName() + " not found. " + paramMap.getMessage());
    }
    return zzdf.zzHF();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzh
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */