package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;

public final class CredentialRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  final int mVersionCode;
  private final boolean zzWd;
  private final String[] zzWe;
  private final CredentialPickerConfig zzWf;
  private final CredentialPickerConfig zzWg;
  
  CredentialRequest(int paramInt, boolean paramBoolean, String[] paramArrayOfString, CredentialPickerConfig paramCredentialPickerConfig1, CredentialPickerConfig paramCredentialPickerConfig2)
  {
    mVersionCode = paramInt;
    zzWd = paramBoolean;
    zzWe = ((String[])zzx.zzz(paramArrayOfString));
    paramArrayOfString = paramCredentialPickerConfig1;
    if (paramCredentialPickerConfig1 == null) {
      paramArrayOfString = new CredentialPickerConfig.Builder().build();
    }
    zzWf = paramArrayOfString;
    paramArrayOfString = paramCredentialPickerConfig2;
    if (paramCredentialPickerConfig2 == null) {
      paramArrayOfString = new CredentialPickerConfig.Builder().build();
    }
    zzWg = paramArrayOfString;
  }
  
  private CredentialRequest(CredentialRequest.Builder paramBuilder)
  {
    this(2, CredentialRequest.Builder.zza(paramBuilder), CredentialRequest.Builder.zzb(paramBuilder), CredentialRequest.Builder.zzc(paramBuilder), CredentialRequest.Builder.zzd(paramBuilder));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final String[] getAccountTypes()
  {
    return zzWe;
  }
  
  public final CredentialPickerConfig getCredentialHintPickerConfig()
  {
    return zzWg;
  }
  
  public final CredentialPickerConfig getCredentialPickerConfig()
  {
    return zzWf;
  }
  
  public final boolean getSupportsPasswordLogin()
  {
    return isPasswordLoginSupported();
  }
  
  public final boolean isPasswordLoginSupported()
  {
    return zzWd;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */