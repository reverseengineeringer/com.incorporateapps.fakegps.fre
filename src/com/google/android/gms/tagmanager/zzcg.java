package com.google.android.gms.tagmanager;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.internal.zzad;
import com.google.android.gms.internal.zzag.zza;
import java.util.Map;

class zzcg
  extends zzak
{
  private static final String ID = zzad.zzbR.toString();
  private final Context mContext;
  
  public zzcg(Context paramContext)
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
    paramMap = new DisplayMetrics();
    ((WindowManager)mContext.getSystemService("window")).getDefaultDisplay().getMetrics(paramMap);
    int i = widthPixels;
    int j = heightPixels;
    return zzdf.zzR(i + "x" + j);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.tagmanager.zzcg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */