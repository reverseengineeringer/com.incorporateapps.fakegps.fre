package com.google.android.gms.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.client.VersionInfoParcel;
import com.google.android.gms.ads.internal.zzr;
import java.io.BufferedOutputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzdg
  implements zzdf
{
  private final Context mContext;
  private final VersionInfoParcel zzpT;
  
  public zzdg(Context paramContext, VersionInfoParcel paramVersionInfoParcel)
  {
    mContext = paramContext;
    zzpT = paramVersionInfoParcel;
  }
  
  /* Error */
  public JSONObject zzQ(String paramString)
  {
    // Byte code:
    //   0: new 28	org/json/JSONObject
    //   3: dup
    //   4: aload_1
    //   5: invokespecial 31	org/json/JSONObject:<init>	(Ljava/lang/String;)V
    //   8: astore 4
    //   10: new 28	org/json/JSONObject
    //   13: dup
    //   14: invokespecial 32	org/json/JSONObject:<init>	()V
    //   17: astore_3
    //   18: ldc 34
    //   20: astore_1
    //   21: aload 4
    //   23: ldc 36
    //   25: invokevirtual 40	org/json/JSONObject:optString	(Ljava/lang/String;)Ljava/lang/String;
    //   28: astore_2
    //   29: aload_2
    //   30: astore_1
    //   31: aload_0
    //   32: aload_0
    //   33: aload 4
    //   35: invokevirtual 44	com/google/android/gms/internal/zzdg:zzc	(Lorg/json/JSONObject;)Lcom/google/android/gms/internal/zzdg$zzb;
    //   38: invokevirtual 48	com/google/android/gms/internal/zzdg:zza	(Lcom/google/android/gms/internal/zzdg$zzb;)Lcom/google/android/gms/internal/zzdg$zzc;
    //   41: astore 4
    //   43: aload_2
    //   44: astore_1
    //   45: aload 4
    //   47: invokevirtual 54	com/google/android/gms/internal/zzdg$zzc:isSuccess	()Z
    //   50: ifeq +64 -> 114
    //   53: aload_2
    //   54: astore_1
    //   55: aload_3
    //   56: ldc 56
    //   58: aload_0
    //   59: aload 4
    //   61: invokevirtual 60	com/google/android/gms/internal/zzdg$zzc:zzdY	()Lcom/google/android/gms/internal/zzdg$zzd;
    //   64: invokevirtual 63	com/google/android/gms/internal/zzdg:zza	(Lcom/google/android/gms/internal/zzdg$zzd;)Lorg/json/JSONObject;
    //   67: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   70: pop
    //   71: aload_2
    //   72: astore_1
    //   73: aload_3
    //   74: ldc 69
    //   76: iconst_1
    //   77: invokevirtual 72	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   80: pop
    //   81: aload_3
    //   82: areturn
    //   83: astore_1
    //   84: ldc 74
    //   86: invokestatic 79	com/google/android/gms/internal/zzin:e	(Ljava/lang/String;)V
    //   89: new 28	org/json/JSONObject
    //   92: dup
    //   93: invokespecial 32	org/json/JSONObject:<init>	()V
    //   96: ldc 69
    //   98: iconst_0
    //   99: invokevirtual 72	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   102: astore_1
    //   103: aload_1
    //   104: areturn
    //   105: astore_1
    //   106: new 28	org/json/JSONObject
    //   109: dup
    //   110: invokespecial 32	org/json/JSONObject:<init>	()V
    //   113: areturn
    //   114: aload_2
    //   115: astore_1
    //   116: aload_3
    //   117: ldc 56
    //   119: new 28	org/json/JSONObject
    //   122: dup
    //   123: invokespecial 32	org/json/JSONObject:<init>	()V
    //   126: ldc 36
    //   128: aload_2
    //   129: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   132: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   135: pop
    //   136: aload_2
    //   137: astore_1
    //   138: aload_3
    //   139: ldc 69
    //   141: iconst_0
    //   142: invokevirtual 72	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   145: pop
    //   146: aload_2
    //   147: astore_1
    //   148: aload_3
    //   149: ldc 81
    //   151: aload 4
    //   153: invokevirtual 85	com/google/android/gms/internal/zzdg$zzc:getReason	()Ljava/lang/String;
    //   156: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   159: pop
    //   160: aload_3
    //   161: areturn
    //   162: astore_2
    //   163: aload_3
    //   164: ldc 56
    //   166: new 28	org/json/JSONObject
    //   169: dup
    //   170: invokespecial 32	org/json/JSONObject:<init>	()V
    //   173: ldc 36
    //   175: aload_1
    //   176: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   179: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   182: pop
    //   183: aload_3
    //   184: ldc 69
    //   186: iconst_0
    //   187: invokevirtual 72	org/json/JSONObject:put	(Ljava/lang/String;Z)Lorg/json/JSONObject;
    //   190: pop
    //   191: aload_3
    //   192: ldc 81
    //   194: aload_2
    //   195: invokevirtual 88	java/lang/Exception:toString	()Ljava/lang/String;
    //   198: invokevirtual 67	org/json/JSONObject:put	(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    //   201: pop
    //   202: aload_3
    //   203: areturn
    //   204: astore_1
    //   205: aload_3
    //   206: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	207	0	this	zzdg
    //   0	207	1	paramString	String
    //   28	119	2	str	String
    //   162	33	2	localException	Exception
    //   17	189	3	localJSONObject	JSONObject
    //   8	144	4	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   0	10	83	org/json/JSONException
    //   89	103	105	org/json/JSONException
    //   21	29	162	java/lang/Exception
    //   31	43	162	java/lang/Exception
    //   45	53	162	java/lang/Exception
    //   55	71	162	java/lang/Exception
    //   73	81	162	java/lang/Exception
    //   116	136	162	java/lang/Exception
    //   138	146	162	java/lang/Exception
    //   148	160	162	java/lang/Exception
    //   163	202	204	org/json/JSONException
  }
  
  protected zzdg.zzc zza(zzdg.zzb paramzzb)
  {
    HttpURLConnection localHttpURLConnection;
    try
    {
      localHttpURLConnection = (HttpURLConnection)paramzzb.zzdV().openConnection();
      zzr.zzbC().zza(mContext, zzpT.afmaVersion, false, localHttpURLConnection);
      localObject1 = paramzzb.zzdW().iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject2 = (zzdg.zza)((Iterator)localObject1).next();
        localHttpURLConnection.addRequestProperty(((zzdg.zza)localObject2).getKey(), ((zzdg.zza)localObject2).getValue());
      }
      if (TextUtils.isEmpty(paramzzb.zzdX())) {
        break label144;
      }
    }
    catch (Exception paramzzb)
    {
      return new zzdg.zzc(this, false, null, paramzzb.toString());
    }
    localHttpURLConnection.setDoOutput(true);
    Object localObject1 = paramzzb.zzdX().getBytes();
    localHttpURLConnection.setFixedLengthStreamingMode(localObject1.length);
    Object localObject2 = new BufferedOutputStream(localHttpURLConnection.getOutputStream());
    ((BufferedOutputStream)localObject2).write((byte[])localObject1);
    ((BufferedOutputStream)localObject2).close();
    label144:
    localObject1 = new ArrayList();
    if (localHttpURLConnection.getHeaderFields() != null)
    {
      localObject2 = localHttpURLConnection.getHeaderFields().entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Map.Entry localEntry = (Map.Entry)((Iterator)localObject2).next();
        Iterator localIterator = ((List)localEntry.getValue()).iterator();
        while (localIterator.hasNext())
        {
          String str = (String)localIterator.next();
          ((ArrayList)localObject1).add(new zzdg.zza((String)localEntry.getKey(), str));
        }
      }
    }
    paramzzb = new zzdg.zzc(this, true, new zzdg.zzd(paramzzb.zzdU(), localHttpURLConnection.getResponseCode(), (List)localObject1, zzr.zzbC().zza(new InputStreamReader(localHttpURLConnection.getInputStream()))), null);
    return paramzzb;
  }
  
  protected JSONObject zza(zzdg.zzd paramzzd)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("http_request_id", paramzzd.zzdU());
      if (paramzzd.getBody() != null) {
        localJSONObject.put("body", paramzzd.getBody());
      }
      JSONArray localJSONArray = new JSONArray();
      Iterator localIterator = paramzzd.zzdZ().iterator();
      while (localIterator.hasNext())
      {
        zzdg.zza localzza = (zzdg.zza)localIterator.next();
        localJSONArray.put(new JSONObject().put("key", localzza.getKey()).put("value", localzza.getValue()));
      }
      localJSONObject.put("headers", localJSONArray);
    }
    catch (JSONException paramzzd)
    {
      zzin.zzb("Error constructing JSON for http response.", paramzzd);
      return localJSONObject;
    }
    localJSONObject.put("response_code", paramzzd.getResponseCode());
    return localJSONObject;
  }
  
  public void zza(zzjp paramzzjp, Map paramMap)
  {
    zziq.zza(new zzdg.1(this, paramMap, paramzzjp));
  }
  
  protected zzdg.zzb zzc(JSONObject paramJSONObject)
  {
    String str1 = paramJSONObject.optString("http_request_id");
    Object localObject1 = paramJSONObject.optString("url");
    String str2 = paramJSONObject.optString("post_body", null);
    try
    {
      localObject1 = new URL((String)localObject1);
      localArrayList = new ArrayList();
      Object localObject2 = paramJSONObject.optJSONArray("headers");
      paramJSONObject = (JSONObject)localObject2;
      if (localObject2 == null) {
        paramJSONObject = new JSONArray();
      }
      int i = 0;
      while (i < paramJSONObject.length())
      {
        localObject2 = paramJSONObject.optJSONObject(i);
        if (localObject2 != null) {
          localArrayList.add(new zzdg.zza(((JSONObject)localObject2).optString("key"), ((JSONObject)localObject2).optString("value")));
        }
        i += 1;
      }
    }
    catch (MalformedURLException localMalformedURLException)
    {
      ArrayList localArrayList;
      URL localURL;
      for (;;)
      {
        zzin.zzb("Error constructing http request.", localMalformedURLException);
        localURL = null;
      }
      return new zzdg.zzb(str1, localURL, localArrayList, str2);
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzdg
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */