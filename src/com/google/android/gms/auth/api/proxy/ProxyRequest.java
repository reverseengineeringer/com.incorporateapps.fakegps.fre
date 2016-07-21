package com.google.android.gms.auth.api.proxy;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class ProxyRequest
  implements SafeParcelable
{
  public static final Parcelable.Creator CREATOR = new zzb();
  public static final int HTTP_METHOD_DELETE;
  public static final int HTTP_METHOD_GET = 0;
  public static final int HTTP_METHOD_HEAD;
  public static final int HTTP_METHOD_OPTIONS;
  public static final int HTTP_METHOD_PATCH = 7;
  public static final int HTTP_METHOD_POST = 1;
  public static final int HTTP_METHOD_PUT = 2;
  public static final int HTTP_METHOD_TRACE;
  public static final int LAST_CODE = 7;
  public static final int VERSION_CODE = 2;
  public final byte[] body;
  public final int httpMethod;
  public final long timeoutMillis;
  public final String url;
  final int versionCode;
  Bundle zzWB;
  
  static
  {
    HTTP_METHOD_DELETE = 3;
    HTTP_METHOD_HEAD = 4;
    HTTP_METHOD_OPTIONS = 5;
    HTTP_METHOD_TRACE = 6;
  }
  
  ProxyRequest(int paramInt1, String paramString, int paramInt2, long paramLong, byte[] paramArrayOfByte, Bundle paramBundle)
  {
    versionCode = paramInt1;
    url = paramString;
    httpMethod = paramInt2;
    timeoutMillis = paramLong;
    body = paramArrayOfByte;
    zzWB = paramBundle;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public Map getHeaderMap()
  {
    LinkedHashMap localLinkedHashMap = new LinkedHashMap(zzWB.size());
    Iterator localIterator = zzWB.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      localLinkedHashMap.put(str, zzWB.getString(str));
    }
    return Collections.unmodifiableMap(localLinkedHashMap);
  }
  
  public String toString()
  {
    return "ProxyRequest[ url: " + url + ", method: " + httpMethod + " ]";
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    zzb.zza(this, paramParcel, paramInt);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.auth.api.proxy.ProxyRequest
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */