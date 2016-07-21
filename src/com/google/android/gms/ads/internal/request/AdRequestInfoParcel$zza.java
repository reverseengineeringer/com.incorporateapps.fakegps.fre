package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import java.util.List;

public final class AdRequestInfoParcel$zza
{
  public final ApplicationInfo applicationInfo;
  public final Bundle zzHA;
  public final boolean zzHB;
  public final Messenger zzHC;
  public final int zzHD;
  public final int zzHE;
  public final float zzHF;
  public final String zzHG;
  public final long zzHH;
  public final String zzHI;
  public final List zzHJ;
  public final List zzHK;
  public final CapabilityParcel zzHM;
  public final String zzHN;
  public final float zzHO;
  public final int zzHP;
  public final int zzHQ;
  public final Bundle zzHs;
  public final AdRequestParcel zzHt;
  public final PackageInfo zzHu;
  public final String zzHw;
  public final String zzHx;
  public final Bundle zzHy;
  public final int zzHz;
  public final NativeAdOptionsParcel zzrD;
  public final List zzrH;
  public final String zzri;
  public final String zzrj;
  public final VersionInfoParcel zzrl;
  public final AdSizeParcel zzrp;
  
  public AdRequestInfoParcel$zza(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt1, int paramInt2, float paramFloat1, String paramString4, long paramLong, String paramString5, List paramList3, String paramString6, NativeAdOptionsParcel paramNativeAdOptionsParcel, CapabilityParcel paramCapabilityParcel, String paramString7, float paramFloat2, int paramInt3, int paramInt4)
  {
    zzHs = paramBundle1;
    zzHt = paramAdRequestParcel;
    zzrp = paramAdSizeParcel;
    zzrj = paramString1;
    applicationInfo = paramApplicationInfo;
    zzHu = paramPackageInfo;
    zzHw = paramString2;
    zzHx = paramString3;
    zzrl = paramVersionInfoParcel;
    zzHy = paramBundle2;
    zzHB = paramBoolean;
    zzHC = paramMessenger;
    zzHD = paramInt1;
    zzHE = paramInt2;
    zzHF = paramFloat1;
    if ((paramList1 != null) && (paramList1.size() > 0))
    {
      zzHz = 3;
      zzrH = paramList1;
      zzHK = paramList2;
      zzHA = paramBundle3;
      zzHG = paramString4;
      zzHH = paramLong;
      zzHI = paramString5;
      zzHJ = paramList3;
      zzri = paramString6;
      zzrD = paramNativeAdOptionsParcel;
      zzHM = paramCapabilityParcel;
      zzHN = paramString7;
      zzHO = paramFloat2;
      zzHP = paramInt3;
      zzHQ = paramInt4;
      return;
    }
    if (zzum) {}
    for (zzHz = 4;; zzHz = 0)
    {
      zzrH = null;
      zzHK = null;
      break;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.AdRequestInfoParcel.zza
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */