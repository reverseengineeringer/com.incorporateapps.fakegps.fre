package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class HintRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzd();
  final int mVersionCode;
  private final String[] zzWe;
  private final CredentialPickerConfig zzWh;
  private final boolean zzWi;
  private final boolean zzWj;
  
  HintRequest(int paramInt, CredentialPickerConfig paramCredentialPickerConfig, boolean paramBoolean1, boolean paramBoolean2, String[] paramArrayOfString)
  {
    mVersionCode = paramInt;
    zzWh = ((CredentialPickerConfig)zzx.zzz(paramCredentialPickerConfig));
    zzWi = paramBoolean1;
    zzWj = paramBoolean2;
    zzWe = ((String[])zzx.zzz(paramArrayOfString));
  }
  
  private HintRequest(HintRequest.Builder paramBuilder)
  {
    this(1, HintRequest.Builder.zza(paramBuilder), HintRequest.Builder.zzb(paramBuilder), HintRequest.Builder.zzc(paramBuilder), HintRequest.Builder.zzd(paramBuilder));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String[] getAccountTypes()
  {
    return zzWe;
  }
  
  public final CredentialPickerConfig getHintPickerConfig()
  {
    return zzWh;
  }
  
  public final boolean isEmailAddressIdentifierSupported()
  {
    return zzWi;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzd.zza(this, paramParcel, paramInt);
  }
  
  public final boolean zzmy()
  {
    return zzWj;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.HintRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */