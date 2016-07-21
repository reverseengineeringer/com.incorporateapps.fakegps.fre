package com.google.android.gms.ads.internal.request;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.os.Bundle;
import android.os.Messenger;
import android.os.Parcel;
import com.google.android.gms.ads.internal.client.AdRequestParcel;
import com.google.android.gms.ads.internal.client.AdSizeParcel;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.List;

public final class AdRequestInfoParcel
  implements SafeParcelable
{
  public static final zzf CREATOR = new zzf();
  public final ApplicationInfo applicationInfo;
  public final int versionCode;
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
  public final long zzHL;
  public final CapabilityParcel zzHM;
  public final String zzHN;
  public final float zzHO;
  public final int zzHP;
  public final int zzHQ;
  public final Bundle zzHs;
  public final AdRequestParcel zzHt;
  public final PackageInfo zzHu;
  public final String zzHv;
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
  
  AdRequestInfoParcel(int paramInt1, Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt2, List paramList1, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt3, int paramInt4, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList2, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, List paramList3, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, int paramInt5, int paramInt6)
  {
    versionCode = paramInt1;
    zzHs = paramBundle1;
    zzHt = paramAdRequestParcel;
    zzrp = paramAdSizeParcel;
    zzrj = paramString1;
    applicationInfo = paramApplicationInfo;
    zzHu = paramPackageInfo;
    zzHv = paramString2;
    zzHw = paramString3;
    zzHx = paramString4;
    zzrl = paramVersionInfoParcel;
    zzHy = paramBundle2;
    zzHz = paramInt2;
    zzrH = paramList1;
    if (paramList3 == null)
    {
      paramBundle1 = Collections.emptyList();
      zzHK = paramBundle1;
      zzHA = paramBundle3;
      zzHB = paramBoolean;
      zzHC = paramMessenger;
      zzHD = paramInt3;
      zzHE = paramInt4;
      zzHF = paramFloat1;
      zzHG = paramString5;
      zzHH = paramLong1;
      zzHI = paramString6;
      if (paramList2 != null) {
        break label225;
      }
    }
    label225:
    for (paramBundle1 = Collections.emptyList();; paramBundle1 = Collections.unmodifiableList(paramList2))
    {
      zzHJ = paramBundle1;
      zzri = paramString7;
      zzrD = paramNativeAdOptionsParcel;
      zzHL = paramLong2;
      zzHM = paramCapabilityParcel;
      zzHN = paramString8;
      zzHO = paramFloat2;
      zzHP = paramInt5;
      zzHQ = paramInt6;
      return;
      paramBundle1 = Collections.unmodifiableList(paramList3);
      break;
    }
  }
  
  public AdRequestInfoParcel(Bundle paramBundle1, AdRequestParcel paramAdRequestParcel, AdSizeParcel paramAdSizeParcel, String paramString1, ApplicationInfo paramApplicationInfo, PackageInfo paramPackageInfo, String paramString2, String paramString3, String paramString4, VersionInfoParcel paramVersionInfoParcel, Bundle paramBundle2, int paramInt1, List paramList1, List paramList2, Bundle paramBundle3, boolean paramBoolean, Messenger paramMessenger, int paramInt2, int paramInt3, float paramFloat1, String paramString5, long paramLong1, String paramString6, List paramList3, String paramString7, NativeAdOptionsParcel paramNativeAdOptionsParcel, long paramLong2, CapabilityParcel paramCapabilityParcel, String paramString8, float paramFloat2, int paramInt4, int paramInt5)
  {
    this(15, paramBundle1, paramAdRequestParcel, paramAdSizeParcel, paramString1, paramApplicationInfo, paramPackageInfo, paramString2, paramString3, paramString4, paramVersionInfoParcel, paramBundle2, paramInt1, paramList1, paramBundle3, paramBoolean, paramMessenger, paramInt2, paramInt3, paramFloat1, paramString5, paramLong1, paramString6, paramList3, paramString7, paramNativeAdOptionsParcel, paramList2, paramLong2, paramCapabilityParcel, paramString8, paramFloat2, paramInt4, paramInt5);
  }
  
  public AdRequestInfoParcel(AdRequestInfoParcel.zza paramzza, String paramString, long paramLong)
  {
    this(zzHs, zzHt, zzrp, zzrj, applicationInfo, zzHu, paramString, zzHw, zzHx, zzrl, zzHy, zzHz, zzrH, zzHK, zzHA, zzHB, zzHC, zzHD, zzHE, zzHF, zzHG, zzHH, zzHI, zzHJ, zzri, zzrD, paramLong, zzHM, zzHN, zzHO, zzHP, zzHQ);
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.request.AdRequestInfoParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */