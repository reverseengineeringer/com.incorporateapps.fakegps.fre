package com.google.android.gms.auth.api.consent;

import android.accounts.Account;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.auth.firstparty.shared.ScopeDetail;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public class GetConsentIntentRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final int mVersionCode;
  private final Account zzTI;
  private final String zzVO;
  private final int zzVP;
  private final String zzVQ;
  final ScopeDetail[] zzVR;
  private final boolean zzVS;
  private final int zzVT;
  private final String zzVU;
  
  GetConsentIntentRequest(int paramInt1, String paramString1, int paramInt2, String paramString2, Account paramAccount, ScopeDetail[] paramArrayOfScopeDetail, boolean paramBoolean, int paramInt3, String paramString3)
  {
    mVersionCode = paramInt1;
    zzVO = paramString1;
    zzVP = paramInt2;
    zzVQ = paramString2;
    zzTI = ((Account)zzx.zzz(paramAccount));
    zzVR = paramArrayOfScopeDetail;
    zzVS = paramBoolean;
    zzVT = paramInt3;
    zzVU = paramString3;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Account getAccount()
  {
    return zzTI;
  }
  
  public String getCallingPackage()
  {
    return zzVO;
  }
  
  public int getCallingUid()
  {
    return zzVP;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzmt()
  {
    return zzVQ;
  }
  
  public boolean zzmu()
  {
    return zzVS;
  }
  
  public int zzmv()
  {
    return zzVT;
  }
  
  public String zzmw()
  {
    return zzVU;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.consent.GetConsentIntentRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */