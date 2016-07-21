package com.google.android.gms.nearby.sharing;

import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzw;
import java.util.Arrays;

public class SharedContent
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  private final int versionCode;
  private String zzbdg;
  private ViewableItem[] zzbdh;
  private LocalContent[] zzbdi;
  
  private SharedContent()
  {
    versionCode = 2;
  }
  
  SharedContent(int paramInt, String paramString, ViewableItem[] paramArrayOfViewableItem, LocalContent[] paramArrayOfLocalContent)
  {
    versionCode = paramInt;
    zzbdg = paramString;
    zzbdh = paramArrayOfViewableItem;
    zzbdi = paramArrayOfLocalContent;
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
      if (!(paramObject instanceof SharedContent)) {
        return false;
      }
      paramObject = (SharedContent)paramObject;
    } while ((zzw.equal(zzbdh, zzbdh)) && (zzw.equal(zzbdi, zzbdi)) && (zzw.equal(zzbdg, zzbdg)));
    return false;
  }
  
  public String getUri()
  {
    return zzbdg;
  }
  
  int getVersionCode()
  {
    return versionCode;
  }
  
  public int hashCode()
  {
    return zzw.hashCode(new Object[] { zzbdh, zzbdi, zzbdg });
  }
  
  public String toString()
  {
    return "SharedContent[viewableItems=" + Arrays.toString(zzbdh) + ", localContents=" + Arrays.toString(zzbdi) + "]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
  
  public ViewableItem[] zzEL()
  {
    return zzbdh;
  }
  
  public LocalContent[] zzEM()
  {
    return zzbdi;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.nearby.sharing.SharedContent
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */