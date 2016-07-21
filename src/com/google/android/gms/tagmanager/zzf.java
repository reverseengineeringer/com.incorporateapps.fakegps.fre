package com.google.android.gms.tagmanager;

import android.content.Context;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzf
  extends zzak
{
  private static final String ID = zzad.zzbt.toString();
  private final Context mContext;
  
  public zzf(Context paramContext)
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
    return zzdf.zzR(mContext.getPackageName());
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzf
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */