package com.google.android.gms.wearable;

import android.net.Uri;
import android.util.Log;
import com.google.android.gms.internal.zzsi;
import com.google.android.gms.internal.zzsi.zza;
import com.google.android.gms.internal.zzsu;
import java.util.List;

public class PutDataMapRequest
{
  private final DataMap zzbrd;
  private final PutDataRequest zzbre;
  
  private PutDataMapRequest(PutDataRequest paramPutDataRequest, DataMap paramDataMap)
  {
    zzbre = paramPutDataRequest;
    zzbrd = new DataMap();
    if (paramDataMap != null) {
      zzbrd.putAll(paramDataMap);
    }
  }
  
  public static PutDataMapRequest create(String paramString)
  {
    return new PutDataMapRequest(PutDataRequest.create(paramString), null);
  }
  
  public static PutDataMapRequest createFromDataMapItem(DataMapItem paramDataMapItem)
  {
    return new PutDataMapRequest(PutDataRequest.zzr(paramDataMapItem.getUri()), paramDataMapItem.getDataMap());
  }
  
  public static PutDataMapRequest createWithAutoAppendedId(String paramString)
  {
    return new PutDataMapRequest(PutDataRequest.createWithAutoAppendedId(paramString), null);
  }
  
  public PutDataRequest asPutDataRequest()
  {
    zzsi.zza localzza = zzsi.zza(zzbrd);
    zzbre.setData(zzsu.toByteArray(zzbty));
    int j = zzbtz.size();
    int i = 0;
    while (i < j)
    {
      String str = Integer.toString(i);
      Asset localAsset = (Asset)zzbtz.get(i);
      if (str == null) {
        throw new IllegalStateException("asset key cannot be null: " + localAsset);
      }
      if (localAsset == null) {
        throw new IllegalStateException("asset cannot be null: key=" + str);
      }
      if (Log.isLoggable("DataMap", 3)) {
        Log.d("DataMap", "asPutDataRequest: adding asset: " + str + " " + localAsset);
      }
      zzbre.putAsset(str, localAsset);
      i += 1;
    }
    return zzbre;
  }
  
  public DataMap getDataMap()
  {
    return zzbrd;
  }
  
  public Uri getUri()
  {
    return zzbre.getUri();
  }
  
  public boolean isUrgent()
  {
    return zzbre.isUrgent();
  }
  
  public PutDataMapRequest setUrgent()
  {
    zzbre.setUrgent();
    return this;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.wearable.PutDataMapRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */