package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class GetCloudSyncOptInOutDoneResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzal();
  public final int statusCode;
  public final int versionCode;
  public final boolean zzbsD;
  
  GetCloudSyncOptInOutDoneResponse(int paramInt1, int paramInt2, boolean paramBoolean)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzbsD = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzal.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.GetCloudSyncOptInOutDoneResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */