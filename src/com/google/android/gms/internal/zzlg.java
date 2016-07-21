package com.google.android.gms.internal;

import android.app.Activity;
import android.content.Intent;
import com.google.android.gms.auth.api.signin.internal.IdpTokenType;
import com.google.android.gms.auth.api.signin.zzd;
import com.google.android.gms.common.internal.zzx;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public abstract class zzlg
  implements zzlf
{
  protected final Activity mActivity;
  private String zzWP;
  private String zzXT;
  protected final Set zzXf;
  private zzlf.zza zzYe;
  
  protected zzlg(Activity paramActivity, List paramList1, List paramList2)
  {
    mActivity = ((Activity)zzx.zzz(paramActivity));
    paramActivity = new HashSet((Collection)zzx.zzz(paramList1));
    paramActivity.addAll((Collection)zzx.zzz(paramList2));
    zzXf = Collections.unmodifiableSet(paramActivity);
  }
  
  protected Intent zza(IdpTokenType paramIdpTokenType, String paramString1, String paramString2)
  {
    zzx.zzz(paramIdpTokenType);
    zzx.zzcM(paramString1);
    Intent localIntent = new Intent("com.google.android.gms.auth.VERIFY_ASSERTION");
    localIntent.putExtra("idpTokenType", paramIdpTokenType);
    localIntent.putExtra("idpToken", paramString1);
    localIntent.putExtra("pendingToken", paramString2);
    paramIdpTokenType = zzmU();
    if (paramIdpTokenType != null) {
      localIntent.putExtra("idProvider", paramIdpTokenType.zzmT());
    }
    return localIntent;
  }
  
  protected void zzb(zzlf.zza paramzza)
  {
    zzYe = ((zzlf.zza)zzx.zzz(paramzza));
  }
  
  protected void zzb(String paramString1, String paramString2, zzlf.zza paramzza)
  {
    zzbW(paramString1);
    zzbX(paramString2);
    zzb(paramzza);
  }
  
  protected void zzbW(String paramString)
  {
    zzWP = paramString;
  }
  
  protected void zzbX(String paramString)
  {
    zzXT = paramString;
  }
  
  protected Set zzns()
  {
    return zzXf;
  }
  
  protected zzlf.zza zznt()
  {
    return zzYe;
  }
  
  protected String zznu()
  {
    return zzXT;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzlg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */