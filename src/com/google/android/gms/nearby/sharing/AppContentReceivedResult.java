package com.google.android.gms.nearby.sharing;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class AppContentReceivedResult
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zza();
  private int statusCode;
  private final int versionCode;
  private Uri zzbde;
  
  private AppContentReceivedResult()
  {
    versionCode = 1;
  }
  
  AppContentReceivedResult(int paramInt1, Uri paramUri, int paramInt2)
  {
    versionCode = paramInt1;
    zzbde = paramUri;
    statusCode = paramInt2;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {}
    do
    {
      return true;
      if (!(paramObject instanceof AppContentReceivedResult)) {
        return false;
      }
      paramObject = (AppContentReceivedResult)paramObject;
    } while ((zzw.equal(zzbde, zzbde)) && (zzw.equal(Integer.valueOf(statusCode), Integer.valueOf(statusCode))));
    return false;
  }
  
  public int getStatusCode()
  {
    return statusCode;
  }
  
  int getVersionCode()
  {
    return versionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbde, Integer.valueOf(statusCode) });
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zza.zza(this, paramParcel, paramInt);
  }
  
  public Uri zzEJ()
  {
    return zzbde;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.AppContentReceivedResult
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */