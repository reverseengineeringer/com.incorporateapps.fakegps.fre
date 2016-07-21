package com.google.android.gms.auth.api.credentials;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class CredentialPickerConfig
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private final boolean mShowCancelButton;
  final int mVersionCode;
  private final boolean zzWb;
  private final boolean zzWc;
  
  CredentialPickerConfig(int paramInt, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    mVersionCode = paramInt;
    zzWb = paramBoolean1;
    mShowCancelButton = paramBoolean2;
    zzWc = paramBoolean3;
  }
  
  private CredentialPickerConfig(CredentialPickerConfig.Builder paramBuilder)
  {
    this(1, CredentialPickerConfig.Builder.zza(paramBuilder), CredentialPickerConfig.Builder.zzb(paramBuilder), CredentialPickerConfig.Builder.zzc(paramBuilder));
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final boolean isForNewAccount()
  {
    return zzWc;
  }
  
  public final boolean shouldShowAddAccountButton()
  {
    return zzWb;
  }
  
  public final boolean shouldShowCancelButton()
  {
    return mShowCancelButton;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.credentials.CredentialPickerConfig
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */