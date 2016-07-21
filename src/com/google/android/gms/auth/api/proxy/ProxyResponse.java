package com.google.android.gms.auth.api.proxy;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ProxyResponse
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzc();
  public static final int STATUS_CODE_NO_CONNECTION = -1;
  public final byte[] body;
  public final int googlePlayServicesStatusCode;
  public final PendingIntent recoveryAction;
  public final int statusCode;
  final int versionCode;
  final Bundle zzWB;
  
  ProxyResponse(int paramInt1, int paramInt2, PendingIntent paramPendingIntent, int paramInt3, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    versionCode = paramInt1;
    googlePlayServicesStatusCode = paramInt2;
    statusCode = paramInt3;
    zzWB = paramBundle;
    body = paramArrayOfByte;
    recoveryAction = paramPendingIntent;
  }
  
  public ProxyResponse(int paramInt1, PendingIntent paramPendingIntent, int paramInt2, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this(1, paramInt1, paramPendingIntent, paramInt2, paramBundle, paramArrayOfByte);
  }
  
  private ProxyResponse(int paramInt, Bundle paramBundle, byte[] paramArrayOfByte)
  {
    this(1, 0, null, paramInt, paramBundle, paramArrayOfByte);
  }
  
  public ProxyResponse(int paramInt, Map paramMap, byte[] paramArrayOfByte)
  {
    this(paramInt, zzL(paramMap), paramArrayOfByte);
  }
  
  public static ProxyResponse createErrorProxyResponse(int paramInt1, PendingIntent paramPendingIntent, int paramInt2, Map paramMap, byte[] paramArrayOfByte)
  {
    return new ProxyResponse(1, paramInt1, paramPendingIntent, paramInt2, zzL(paramMap), paramArrayOfByte);
  }
  
  private static Bundle zzL(Map paramMap)
  {
    Bundle localBundle = new Bundle();
    if (paramMap == null) {
      return localBundle;
    }
    paramMap = paramMap.entrySet().iterator();
    while (paramMap.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramMap.next();
      localBundle.putString((String)localEntry.getKey(), (String)localEntry.getValue());
    }
    return localBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Map getHeaders()
  {
    HashMap localHashMap = new HashMap();
    Iterator localIterator = zzWB.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localHashMap.put(str, zzWB.getString(str));
    }
    return localHashMap;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzc.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.proxy.ProxyResponse
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */