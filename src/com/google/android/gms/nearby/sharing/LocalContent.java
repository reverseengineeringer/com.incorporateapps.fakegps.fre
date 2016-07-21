package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;

public class LocalContent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  private int type;
  private final int versionCode;
  private String zzbdf;
  
  private LocalContent()
  {
    versionCode = 1;
  }
  
  LocalContent(int paramInt1, int paramInt2, String paramString)
  {
    versionCode = paramInt1;
    type = paramInt2;
    zzbdf = paramString;
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
      if (!(paramObject instanceof LocalContent)) {
        return false;
      }
      paramObject = (LocalContent)paramObject;
    } while ((zzw.equal(Integer.valueOf(type), Integer.valueOf(type))) && (zzw.equal(zzbdf, zzbdf)));
    return false;
  }
  
  public int getType()
  {
    return type;
  }
  
  int getVersionCode()
  {
    return versionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { Integer.valueOf(type), zzbdf });
  }
  
  public String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("LocalContent[contentUri=").append(zzbdf).append(", type=");
    if (type == 1) {}
    for (String str = "PUBLIC_CONTENT";; str = "APP_CONTENT") {
      return str + "]";
    }
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
  
  public String zzEK()
  {
    return zzbdf;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.LocalContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */