package com.google.android.gms.internal;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpEntityEnclosingRequestBase;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpHead;
import org.apache.http.client.methods.HttpOptions;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpTrace;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.entity.ByteArrayEntity;
import org.apache.http.params.HttpConnectionParams;

public class zzw
  implements zzy
{
  protected final HttpClient zzaD;
  
  public zzw(HttpClient paramHttpClient)
  {
    zzaD = paramHttpClient;
  }
  
  private static void zza(HttpEntityEnclosingRequestBase paramHttpEntityEnclosingRequestBase, zzk paramzzk)
  {
    paramzzk = paramzzk.zzq();
    if (paramzzk != null) {
      paramHttpEntityEnclosingRequestBase.setEntity(new ByteArrayEntity(paramzzk));
    }
  }
  
  private static void zza(HttpUriRequest paramHttpUriRequest, Map paramMap)
  {
    Iterator localIterator = paramMap.keySet().iterator();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      paramHttpUriRequest.setHeader(str, (String)paramMap.get(str));
    }
  }
  
  static HttpUriRequest zzb(zzk paramzzk, Map paramMap)
  {
    switch (paramzzk.getMethod())
    {
    default: 
      throw new IllegalStateException("Unknown request method.");
    case -1: 
      paramMap = paramzzk.zzm();
      if (paramMap != null)
      {
        HttpPost localHttpPost = new HttpPost(paramzzk.getUrl());
        localHttpPost.addHeader("Content-Type", paramzzk.zzl());
        localHttpPost.setEntity(new ByteArrayEntity(paramMap));
        return localHttpPost;
      }
      return new HttpGet(paramzzk.getUrl());
    case 0: 
      return new HttpGet(paramzzk.getUrl());
    case 3: 
      return new HttpDelete(paramzzk.getUrl());
    case 1: 
      paramMap = new HttpPost(paramzzk.getUrl());
      paramMap.addHeader("Content-Type", paramzzk.zzp());
      zza(paramMap, paramzzk);
      return paramMap;
    case 2: 
      paramMap = new HttpPut(paramzzk.getUrl());
      paramMap.addHeader("Content-Type", paramzzk.zzp());
      zza(paramMap, paramzzk);
      return paramMap;
    case 4: 
      return new HttpHead(paramzzk.getUrl());
    case 5: 
      return new HttpOptions(paramzzk.getUrl());
    case 6: 
      return new HttpTrace(paramzzk.getUrl());
    }
    paramMap = new zzw.zza(paramzzk.getUrl());
    paramMap.addHeader("Content-Type", paramzzk.zzp());
    zza(paramMap, paramzzk);
    return paramMap;
  }
  
  public HttpResponse zza(zzk paramzzk, Map paramMap)
  {
    HttpUriRequest localHttpUriRequest = zzb(paramzzk, paramMap);
    zza(localHttpUriRequest, paramMap);
    zza(localHttpUriRequest, paramzzk.getHeaders());
    zza(localHttpUriRequest);
    paramMap = localHttpUriRequest.getParams();
    int i = paramzzk.zzt();
    HttpConnectionParams.setConnectionTimeout(paramMap, 5000);
    HttpConnectionParams.setSoTimeout(paramMap, i);
    return zzaD.execute(localHttpUriRequest);
  }
  
  protected void zza(HttpUriRequest paramHttpUriRequest) {}
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */