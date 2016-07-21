package com.google.android.gms.tagmanager;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzg
  extends zzak
{
  private static final String ID = zzad.zzbu.toString();
  private final Context mContext;
  
  public zzg(Context paramContext)
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
      paramMap = mContext.getPackageManager();
      paramMap = zzdf.zzR(paramMap.getApplicationLabel(paramMap.getApplicationInfo(mContext.getPackageName(), 0)).toString());
      return paramMap;
    }
    catch (PackageManager.NameNotFoundException paramMap)
    {
      zzbg.zzb("App name is not found.", paramMap);
    }
    return zzdf.zzHF();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */