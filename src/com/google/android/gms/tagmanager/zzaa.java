package com.google.android.gms.tagmanager;

import android.content.Context;
import android.provider.Settings.Secure;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzaa
  extends zzak
{
  private static final String ID = zzad.zzbY.toString();
  private final Context mContext;
  
  public zzaa(Context paramContext)
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
    paramMap = zzaY(mContext);
    if (paramMap == null) {
      return zzdf.zzHF();
    }
    return zzdf.zzR(paramMap);
  }
  
  protected String zzaY(Context paramContext)
  {
    return Settings.Secure.getString(paramContext.getContentResolver(), "android_id");
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzaa
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */