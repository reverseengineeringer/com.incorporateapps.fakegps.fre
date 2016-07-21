package com.google.android.gms.wearable.internal;

import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.wearable.DataItem;
import com.google.android.gms.wearable.DataItemAsset;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class DataItemParcelable
  implements SafeParcelable, DataItem
{
  public static final Parcelable.Creator CREATOR = new zzae();
  private final Uri mUri;
  final int mVersionCode;
  private byte[] zzaKm;
  private final Map zzbsy;
  
  DataItemParcelable(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    mVersionCode = paramInt;
    mUri = paramUri;
    paramUri = new HashMap();
    paramBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    Iterator localIterator = paramBundle.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramUri.put(str, (DataItemAssetParcelable)paramBundle.getParcelable(str));
    }
    zzbsy = paramUri;
    zzaKm = paramArrayOfByte;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Map getAssets()
  {
    return zzbsy;
  }
  
  public byte[] getData()
  {
    return zzaKm;
  }
  
  public Uri getUri()
  {
    return mUri;
  }
  
  public boolean isDataValid()
  {
    return true;
  }
  
  public String toString()
  {
    return toString(Log.isLoggable("DataItem", 3));
  }
  
  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("DataItemParcelable[");
    localStringBuilder.append("@");
    localStringBuilder.append(Integer.toHexString(hashCode()));
    Object localObject2 = new StringBuilder(",dataSz=");
    if (zzaKm == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(zzaKm.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + zzbsy.size());
      localStringBuilder.append(", uri=" + mUri);
      if (paramBoolean) {
        break;
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    localStringBuilder.append("]\n  assets: ");
    localObject1 = zzbsy.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuilder.append("\n    " + (String)localObject2 + ": " + zzbsy.get(localObject2));
    }
    localStringBuilder.append("\n  ]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzae.zza(this, paramParcel, paramInt);
  }
  
  public DataItemParcelable zzIN()
  {
    return this;
  }
  
  public Bundle zzIv()
  {
    Bundle localBundle = new Bundle();
    localBundle.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    Iterator localIterator = zzbsy.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      localBundle.putParcelable((String)localEntry.getKey(), new DataItemAssetParcelable((DataItemAsset)localEntry.getValue()));
    }
    return localBundle;
  }
  
  public DataItemParcelable zzz(byte[] paramArrayOfByte)
  {
    zzaKm = paramArrayOfByte;
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.internal.DataItemParcelable
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */