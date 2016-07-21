package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public final class LandmarkParcel
  implements SafeParcelable
{
  public static final zze CREATOR = new zze();
  public final int type;
  public final int versionCode;
  public final float x;
  public final float y;
  
  public LandmarkParcel(int paramInt1, float paramFloat1, float paramFloat2, int paramInt2)
  {
    versionCode = paramInt1;
    x = paramFloat1;
    y = paramFloat2;
    type = paramInt2;
  }
  
  public final int describeContents()
  {
    return 0;
  }
  
  public final void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zze.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.LandmarkParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */