package com.google.android.gms.vision.face.internal.client;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class FaceSettingsParcel
  implements SafeParcelable
{
  public static final zzb CREATOR = new zzb();
  public int mode;
  public final int versionCode;
  public int zzbnV;
  public int zzbnW;
  public boolean zzbnX;
  public boolean zzbnY;
  public float zzbnZ;
  
  public FaceSettingsParcel()
  {
    versionCode = 2;
  }
  
  public FaceSettingsParcel(int paramInt1, int paramInt2, int paramInt3, int paramInt4, boolean paramBoolean1, boolean paramBoolean2, float paramFloat)
  {
    versionCode = paramInt1;
    mode = paramInt2;
    zzbnV = paramInt3;
    zzbnW = paramInt4;
    zzbnX = paramBoolean1;
    zzbnY = paramBoolean2;
    zzbnZ = paramFloat;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.vision.face.internal.client.FaceSettingsParcel
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */