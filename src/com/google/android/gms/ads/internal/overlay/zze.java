package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import com.google.android.gms.internal.zzir;
import com.google.android.gms.internal.zzne;

public class zze
{
  public void zza(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel)
  {
    zza(paramContext, paramAdOverlayInfoParcel, true);
  }
  
  public void zza(Context paramContext, AdOverlayInfoParcel paramAdOverlayInfoParcel, boolean paramBoolean)
  {
    if ((zzEJ == 4) && (zzEC == null))
    {
      if (zzEB != null) {
        zzEB.onAdClicked();
      }
      zzr.zzbz().zza(paramContext, zzEA, zzEI);
      return;
    }
    Intent localIntent = new Intent();
    localIntent.setClassName(paramContext, "com.google.android.gms.ads.AdActivity");
    localIntent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", zzrl.zzNb);
    localIntent.putExtra("shouldCallOnOverlayOpened", paramBoolean);
    AdOverlayInfoParcel.zza(localIntent, paramAdOverlayInfoParcel);
    if (!zzne.isAtLeastL()) {
      localIntent.addFlags(524288);
    }
    if (!(paramContext instanceof Activity)) {
      localIntent.addFlags(268435456);
    }
    zzr.zzbC().zzb(paramContext, localIntent);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.overlay.zze
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */