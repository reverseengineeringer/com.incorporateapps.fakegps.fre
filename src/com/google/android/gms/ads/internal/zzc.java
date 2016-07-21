package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Handler;
import android.view.View;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.internal.zzcb;
import com.google.android.gms.internal.zzcf;
import com.google.android.gms.internal.zzeh;
import com.google.android.gms.internal.zzex;
import com.google.android.gms.internal.zzft;
import com.google.android.gms.internal.zzgr;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzif.zza;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zziu;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import com.google.android.gms.internal.zzjr;

public abstract class zzc
  extends zzb
  implements zzg, zzft
{
  public zzc(Context paramContext, AdSizeParcel paramAdSizeParcel, String paramString, zzex paramzzex, VersionInfoParcel paramVersionInfoParcel, zzd paramzzd)
  {
    super(paramContext, paramAdSizeParcel, paramString, paramzzex, paramVersionInfoParcel, paramzzd);
  }
  
  protected zzjp zza(zzif.zza paramzza, zze paramzze)
  {
    Object localObject = zzpj.zzrm.getNextView();
    if ((localObject instanceof zzjp))
    {
      zzin.zzaI("Reusing webview...");
      localObject = (zzjp)localObject;
      ((zzjp)localObject).zza(zzpj.context, zzpj.zzrp, zzpe);
    }
    for (;;)
    {
      ((zzjp)localObject).zzhU().zzb(this, this, this, this, false, this, null, paramzze, this);
      zza((zzeh)localObject);
      ((zzjp)localObject).zzaM(zzLd.zzHI);
      return (zzjp)localObject;
      if (localObject != null) {
        zzpj.zzrm.removeView((View)localObject);
      }
      localObject = zzr.zzbD().zza(zzpj.context, zzpj.zzrp, false, false, zzpj.zzrk, zzpj.zzrl, zzpe, zzpm);
      if (zzpj.zzrp.zzuj == null) {
        zzb(((zzjp)localObject).getView());
      }
    }
  }
  
  public void zza(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    zzaS();
  }
  
  public void zza(zzcf paramzzcf)
  {
    zzx.zzcD("setOnCustomRenderedAdLoadedListener must be called on the main UI thread.");
    zzpj.zzrE = paramzzcf;
  }
  
  protected void zza(zzeh paramzzeh)
  {
    paramzzeh.zza("/trackActiveViewUnit", new zzc.1(this));
  }
  
  protected void zza(zzif.zza paramzza, zzcb paramzzcb)
  {
    if (errorCode != -2)
    {
      zzir.zzMc.post(new zzc.2(this, paramzza));
      return;
    }
    if (zzrp != null) {
      zzpj.zzrp = zzrp;
    }
    if ((zzLe.zzHT) && (!zzLe.zzum))
    {
      zzpj.zzrL = 0;
      zzpj.zzro = zzr.zzbB().zza(zzpj.context, this, paramzza, zzpj.zzrk, null, zzpn, this, paramzzcb);
      return;
    }
    zzir.zzMc.post(new zzc.3(this, paramzza, paramzzcb));
  }
  
  protected boolean zza(zzif paramzzif1, zzif paramzzif2)
  {
    if ((zzpj.zzbW()) && (zzpj.zzrm != null)) {
      zzpj.zzrm.zzcc().zzaF(zzHY);
    }
    return super.zza(paramzzif1, paramzzif2);
  }
  
  public void zzbd()
  {
    onAdClicked();
  }
  
  public void zzbe()
  {
    recordImpression();
    zzaP();
  }
  
  public void zzbf()
  {
    zzaQ();
  }
  
  public void zzc(View paramView)
  {
    zzpj.zzrK = paramView;
    zzb(new zzif(zzpj.zzrr, null, null, null, null, null, null));
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzc
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */