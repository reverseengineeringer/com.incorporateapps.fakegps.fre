package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncOptInStatusResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzam();
  public final int statusCode;
  public final int versionCode;
  public final boolean zzbsE;
  public final boolean zzbsF;
  
  GetCloudSyncOptInStatusResponse(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzbsE = paramBoolean1;
    zzbsF = paramBoolean2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzam.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.GetCloudSyncOptInStatusResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */