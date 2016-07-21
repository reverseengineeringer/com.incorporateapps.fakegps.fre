package com.google.android.gms.games.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

public class ConnectionInfo
  implements SafeParcelable
{
  public static final ConnectionInfoCreator CREATOR = new ConnectionInfoCreator();
  private final int mVersionCode;
  private final String zzaDX;
  private final int zzaDY;
  
  public ConnectionInfo(int paramInt1, String paramString, int paramInt2)
  {
    mVersionCode = paramInt1;
    zzaDX = paramString;
    zzaDY = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public int getVersionCode()
  {
    return mVersionCode;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    ConnectionInfoCreator.zza(this, paramParcel, paramInt);
  }
  
  public String zzwt()
  {
    return zzaDX;
  }
  
  public int zzwu()
  {
    return zzaDY;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.games.internal.ConnectionInfo
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */