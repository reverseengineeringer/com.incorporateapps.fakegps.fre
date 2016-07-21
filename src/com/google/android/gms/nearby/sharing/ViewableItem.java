package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Arrays;

public class ViewableItem
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzf();
  private final int versionCode;
  private String[] zzbdj;
  
  private ViewableItem()
  {
    versionCode = 1;
  }
  
  ViewableItem(int paramInt, String[] paramArrayOfString)
  {
    versionCode = paramInt;
    zzbdj = paramArrayOfString;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof ViewableItem)) {
      return false;
    }
    paramObject = (ViewableItem)paramObject;
    return zzw.equal(zzbdj, zzbdj);
  }
  
  int getVersionCode()
  {
    return versionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbdj });
  }
  
  public String toString()
  {
    return "ViewableItem[uris=" + Arrays.toString(zzbdj) + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzf.zza(this, paramParcel, paramInt);
  }
  
  public String[] zzEN()
  {
    return zzbdj;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.ViewableItem
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */