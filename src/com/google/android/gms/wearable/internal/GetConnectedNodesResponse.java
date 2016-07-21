package com.google.android.gms.wearable.internal;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.List;

public class GetConnectedNodesResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzaq();
  public final int statusCode;
  public final int versionCode;
  public final List zzbsI;
  
  GetConnectedNodesResponse(int paramInt1, int paramInt2, List paramList)
  {
    versionCode = paramInt1;
    statusCode = paramInt2;
    zzbsI = paramList;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzaq.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.GetConnectedNodesResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */