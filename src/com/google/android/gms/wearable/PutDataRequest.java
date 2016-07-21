package com.google.android.gms.wearable;

import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.common.internal.zzx;
import com.google.android.gms.wearable.internal.DataItemAssetParcelable;
import java.security.SecureRandom;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Random;
import java.util.Set;
import java.util.concurrent.TimeUnit;

public class PutDataRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzh();
  public static final String WEAR_URI_SCHEME = "wear";
  private static final long zzbrf = TimeUnit.MINUTES.toMillis(30L);
  private static final Random zzbrg = new SecureRandom();
  private final Uri mUri;
  final int mVersionCode;
  private byte[] zzaKm;
  private final Bundle zzbrh;
  private long zzbri;
  
  private PutDataRequest(int paramInt, Uri paramUri)
  {
    this(paramInt, paramUri, new Bundle(), null, zzbrf);
  }
  
  PutDataRequest(int paramInt, Uri paramUri, Bundle paramBundle, byte[] paramArrayOfByte, long paramLong)
  {
    mVersionCode = paramInt;
    mUri = paramUri;
    zzbrh = paramBundle;
    zzbrh.setClassLoader(DataItemAssetParcelable.class.getClassLoader());
    zzaKm = paramArrayOfByte;
    zzbri = paramLong;
  }
  
  public static PutDataRequest create(String paramString)
  {
    return zzr(zzgL(paramString));
  }
  
  public static PutDataRequest createFromDataItem(DataItem paramDataItem)
  {
    PutDataRequest localPutDataRequest = zzr(paramDataItem.getUri());
    Iterator localIterator = paramDataItem.getAssets().entrySet().iterator();
    while (localIterator.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)localIterator.next();
      if (((DataItemAsset)localEntry.getValue()).getId() == null) {
        throw new IllegalStateException("Cannot create an asset for a put request without a digest: " + (String)localEntry.getKey());
      }
      localPutDataRequest.putAsset((String)localEntry.getKey(), Asset.createFromRef(((DataItemAsset)localEntry.getValue()).getId()));
    }
    localPutDataRequest.setData(paramDataItem.getData());
    return localPutDataRequest;
  }
  
  public static PutDataRequest createWithAutoAppendedId(String paramString)
  {
    StringBuilder localStringBuilder = new StringBuilder(paramString);
    if (!paramString.endsWith("/")) {
      localStringBuilder.append("/");
    }
    localStringBuilder.append("PN").append(zzbrg.nextLong());
    return new PutDataRequest(2, zzgL(localStringBuilder.toString()));
  }
  
  private static Uri zzgL(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {
      throw new IllegalArgumentException("An empty path was supplied.");
    }
    if (!paramString.startsWith("/")) {
      throw new IllegalArgumentException("A path must start with a single / .");
    }
    if (paramString.startsWith("//")) {
      throw new IllegalArgumentException("A path must start with a single / .");
    }
    return new Uri.Builder().scheme("wear").path(paramString).build();
  }
  
  public static PutDataRequest zzr(Uri paramUri)
  {
    return new PutDataRequest(2, paramUri);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Asset getAsset(String paramString)
  {
    return (Asset)zzbrh.getParcelable(paramString);
  }
  
  public Map getAssets()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = zzbrh.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, (Asset)zzbrh.getParcelable(str));
    }
    return Collections.unmodifiableMap(localHashMap);
  }
  
  public byte[] getData()
  {
    return zzaKm;
  }
  
  public Uri getUri()
  {
    return mUri;
  }
  
  public boolean hasAsset(String paramString)
  {
    return zzbrh.containsKey(paramString);
  }
  
  public boolean isUrgent()
  {
    return zzbri == 0L;
  }
  
  public PutDataRequest putAsset(String paramString, Asset paramAsset)
  {
    zzx.zzz(paramString);
    zzx.zzz(paramAsset);
    zzbrh.putParcelable(paramString, paramAsset);
    return this;
  }
  
  public PutDataRequest removeAsset(String paramString)
  {
    zzbrh.remove(paramString);
    return this;
  }
  
  public PutDataRequest setData(byte[] paramArrayOfByte)
  {
    zzaKm = paramArrayOfByte;
    return this;
  }
  
  public PutDataRequest setUrgent()
  {
    zzbri = 0L;
    return this;
  }
  
  public String toString()
  {
    return toString(Log.isLoggable("DataMap", 3));
  }
  
  public String toString(boolean paramBoolean)
  {
    StringBuilder localStringBuilder = new StringBuilder("PutDataRequest[");
    Object localObject2 = new StringBuilder("dataSz=");
    if (zzaKm == null) {}
    for (Object localObject1 = "null";; localObject1 = Integer.valueOf(zzaKm.length))
    {
      localStringBuilder.append(localObject1);
      localStringBuilder.append(", numAssets=" + zzbrh.size());
      localStringBuilder.append(", uri=" + mUri);
      localStringBuilder.append(", syncDeadline=" + zzbri);
      if (paramBoolean) {
        break;
      }
      localStringBuilder.append("]");
      return localStringBuilder.toString();
    }
    localStringBuilder.append("]\n  assets: ");
    localObject1 = zzbrh.keySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (String)((Iterator)localObject1).next();
      localStringBuilder.append("\n    " + (String)localObject2 + ": " + zzbrh.getParcelable((String)localObject2));
    }
    localStringBuilder.append("\n  ]");
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzh.zza(this, paramParcel, paramInt);
  }
  
  public Bundle zzIv()
  {
    return zzbrh;
  }
  
  public long zzIw()
  {
    return zzbri;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.PutDataRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */