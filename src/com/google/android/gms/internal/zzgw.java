package com.google.android.gms.internal;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.RemoteException;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.formats.NativeAdOptionsParcel;
import com.google.android.gms.ads.internal.formats.zzc;
import com.google.android.gms.ads.internal.formats.zzf;
import com.google.android.gms.ads.internal.formats.zzh.zza;
import com.google.android.gms.ads.internal.formats.zzi;
import com.google.android.gms.ads.internal.request.AdRequestInfoParcel;
import com.google.android.gms.ads.internal.request.AdResponseParcel;
import com.google.android.gms.ads.internal.zzp;
import com.google.android.gms.dynamic.zze;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class zzgw
  implements Callable
{
  private static final long zzGF = TimeUnit.SECONDS.toMillis(60L);
  private final Context mContext;
  private final zziw zzGG;
  private final zzp zzGH;
  private final zzee zzGI;
  private boolean zzGJ;
  private List zzGK;
  private JSONObject zzGL;
  private final zzif.zza zzGd;
  private int zzGu;
  private final Object zzpV = new Object();
  private final zzan zzyt;
  
  public zzgw(Context paramContext, zzp paramzzp, zzee paramzzee, zziw paramzziw, zzan paramzzan, zzif.zza paramzza)
  {
    mContext = paramContext;
    zzGH = paramzzp;
    zzGG = paramzziw;
    zzGI = paramzzee;
    zzGd = paramzza;
    zzyt = paramzzan;
    zzGJ = false;
    zzGu = -2;
    zzGK = null;
  }
  
  private zzh.zza zza(zzed paramzzed, zzgw.zza paramzza, JSONObject paramJSONObject)
  {
    if (zzgn()) {
      return null;
    }
    JSONObject localJSONObject = paramJSONObject.getJSONObject("tracking_urls_and_actions");
    Object localObject = zzc(localJSONObject, "impression_tracking_urls");
    if (localObject == null) {}
    for (localObject = null;; localObject = Arrays.asList((Object[])localObject))
    {
      zzGK = ((List)localObject);
      zzGL = localJSONObject.optJSONObject("active_view");
      paramzza = paramzza.zza(this, paramJSONObject);
      if (paramzza != null) {
        break;
      }
      zzin.e("Failed to retrieve ad assets.");
      return null;
    }
    paramzza.zzb(new zzi(mContext, zzGH, paramzzed, zzyt, paramJSONObject, paramzza, zzGd.zzLd.zzrl));
    return paramzza;
  }
  
  private zzif zza(zzh.zza paramzza)
  {
    for (;;)
    {
      synchronized (zzpV)
      {
        int j = zzGu;
        int i = j;
        if (paramzza == null)
        {
          i = j;
          if (zzGu == -2) {
            i = 0;
          }
        }
        if (i != -2)
        {
          paramzza = null;
          return new zzif(zzGd.zzLd.zzHt, null, zzGd.zzLe.zzBQ, i, zzGd.zzLe.zzBR, zzGK, zzGd.zzLe.orientation, zzGd.zzLe.zzBU, zzGd.zzLd.zzHw, false, null, null, null, null, null, 0L, zzGd.zzrp, zzGd.zzLe.zzHS, zzGd.zzKY, zzGd.zzKZ, zzGd.zzLe.zzHY, zzGL, paramzza, null, null, null, zzGd.zzLe.zzIm);
        }
      }
    }
  }
  
  private zzjg zza(JSONObject paramJSONObject, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    double d;
    for (String str = paramJSONObject.getString("url");; str = paramJSONObject.optString("url"))
    {
      d = paramJSONObject.optDouble("scale", 1.0D);
      if (!TextUtils.isEmpty(str)) {
        break;
      }
      zza(0, paramBoolean1);
      return new zzje(null);
    }
    if (paramBoolean2) {
      return new zzje(new zzc(null, Uri.parse(str), d));
    }
    return zzGG.zza(str, new zzgw.5(this, paramBoolean1, d, str));
  }
  
  private void zza(zzh.zza paramzza, zzed paramzzed)
  {
    if (!(paramzza instanceof zzf)) {
      return;
    }
    Object localObject = (zzf)paramzza;
    paramzza = new zzgw.zzb(this);
    localObject = new zzgw.3(this, (zzf)localObject);
    zzHb = ((zzdf)localObject);
    paramzzed.zza("/nativeAdCustomClick", (zzdf)localObject);
  }
  
  private Integer zzb(JSONObject paramJSONObject, String paramString)
  {
    try
    {
      paramJSONObject = paramJSONObject.getJSONObject(paramString);
      int i = Color.rgb(paramJSONObject.getInt("r"), paramJSONObject.getInt("g"), paramJSONObject.getInt("b"));
      return Integer.valueOf(i);
    }
    catch (JSONException paramJSONObject) {}
    return null;
  }
  
  private JSONObject zzb(zzed paramzzed)
  {
    if (zzgn()) {
      return null;
    }
    zzjd localzzjd = new zzjd();
    zzgw.zzb localzzb = new zzgw.zzb(this);
    zzgw.1 local1 = new zzgw.1(this, paramzzed, localzzb, localzzjd);
    zzHb = local1;
    paramzzed.zza("/nativeAdPreProcess", local1);
    paramzzed.zza("google.afma.nativeAds.preProcessJsonGmsg", new JSONObject(zzGd.zzLe.body));
    return (JSONObject)localzzjd.get(zzGF, TimeUnit.MILLISECONDS);
  }
  
  private void zzb(zzcp paramzzcp, String paramString)
  {
    try
    {
      zzct localzzct = zzGH.zzs(paramzzcp.getCustomTemplateId());
      if (localzzct != null) {
        localzzct.zza(paramzzcp, paramString);
      }
      return;
    }
    catch (RemoteException paramzzcp)
    {
      zzin.zzd("Failed to call onCustomClick for asset " + paramString + ".", paramzzcp);
    }
  }
  
  private String[] zzc(JSONObject paramJSONObject, String paramString)
  {
    paramJSONObject = paramJSONObject.optJSONArray(paramString);
    if (paramJSONObject == null) {
      return null;
    }
    paramString = new String[paramJSONObject.length()];
    int i = 0;
    while (i < paramJSONObject.length())
    {
      paramString[i] = paramJSONObject.getString(i);
      i += 1;
    }
    return paramString;
  }
  
  private static List zzf(List paramList)
  {
    ArrayList localArrayList = new ArrayList();
    paramList = paramList.iterator();
    while (paramList.hasNext()) {
      localArrayList.add((Drawable)zze.zzp(((zzc)paramList.next()).zzdJ()));
    }
    return localArrayList;
  }
  
  private zzed zzgm()
  {
    if (zzgn()) {
      return null;
    }
    String str = (String)zzbt.zzwC.get();
    if (zzGd.zzLe.zzEF.indexOf("https") == 0) {}
    for (Object localObject = "https:";; localObject = "http:")
    {
      localObject = (String)localObject + str;
      localObject = (zzed)zzGI.zza(mContext, zzGd.zzLd.zzrl, (String)localObject, zzyt).get(zzGF, TimeUnit.MILLISECONDS);
      ((zzed)localObject).zza(zzGH, zzGH, zzGH, zzGH, false, null, null, null, null);
      return (zzed)localObject;
    }
  }
  
  public void zzF(int paramInt)
  {
    synchronized (zzpV)
    {
      zzGJ = true;
      zzGu = paramInt;
      return;
    }
  }
  
  public zzjg zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2)
  {
    if (paramBoolean1) {}
    for (paramJSONObject = paramJSONObject.getJSONObject(paramString);; paramJSONObject = paramJSONObject.optJSONObject(paramString))
    {
      paramString = paramJSONObject;
      if (paramJSONObject == null) {
        paramString = new JSONObject();
      }
      return zza(paramString, paramBoolean1, paramBoolean2);
    }
  }
  
  public List zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3)
  {
    if (paramBoolean1) {}
    ArrayList localArrayList;
    for (paramJSONObject = paramJSONObject.getJSONArray(paramString);; paramJSONObject = paramJSONObject.optJSONArray(paramString))
    {
      localArrayList = new ArrayList();
      if ((paramJSONObject != null) && (paramJSONObject.length() != 0)) {
        break;
      }
      zza(0, paramBoolean1);
      return localArrayList;
    }
    if (paramBoolean3) {}
    for (int i = paramJSONObject.length();; i = 1)
    {
      int j = 0;
      while (j < i)
      {
        JSONObject localJSONObject = paramJSONObject.getJSONObject(j);
        paramString = localJSONObject;
        if (localJSONObject == null) {
          paramString = new JSONObject();
        }
        localArrayList.add(zza(paramString, paramBoolean1, paramBoolean2));
        j += 1;
      }
    }
    return localArrayList;
  }
  
  public Future zza(JSONObject paramJSONObject, String paramString, boolean paramBoolean)
  {
    paramString = paramJSONObject.getJSONObject(paramString);
    boolean bool = paramString.optBoolean("require", true);
    paramJSONObject = paramString;
    if (paramString == null) {
      paramJSONObject = new JSONObject();
    }
    return zza(paramJSONObject, bool, paramBoolean);
  }
  
  public void zza(int paramInt, boolean paramBoolean)
  {
    if (paramBoolean) {
      zzF(paramInt);
    }
  }
  
  protected zzgw.zza zze(JSONObject paramJSONObject)
  {
    if (zzgn()) {
      return null;
    }
    String str = paramJSONObject.getString("template_id");
    boolean bool1;
    if (zzGd.zzLd.zzrD != null)
    {
      bool1 = zzGd.zzLd.zzrD.zzyA;
      if (zzGd.zzLd.zzrD == null) {
        break label98;
      }
    }
    label98:
    for (boolean bool2 = zzGd.zzLd.zzrD.zzyC;; bool2 = false)
    {
      if (!"2".equals(str)) {
        break label103;
      }
      return new zzgx(bool1, bool2);
      bool1 = false;
      break;
    }
    label103:
    if ("1".equals(str)) {
      return new zzgy(bool1, bool2);
    }
    if ("3".equals(str))
    {
      str = paramJSONObject.getString("custom_template_id");
      zzjd localzzjd = new zzjd();
      zzir.zzMc.post(new zzgw.2(this, localzzjd, str));
      if (localzzjd.get(zzGF, TimeUnit.MILLISECONDS) != null) {
        return new zzgz(bool1);
      }
      zzin.e("No handler for custom template: " + paramJSONObject.getString("custom_template_id"));
    }
    for (;;)
    {
      return null;
      zzF(0);
    }
  }
  
  public zzjg zzf(JSONObject paramJSONObject)
  {
    JSONObject localJSONObject = paramJSONObject.optJSONObject("attribution");
    if (localJSONObject == null) {
      return new zzje(null);
    }
    String str = localJSONObject.optString("text");
    int i = localJSONObject.optInt("text_size", -1);
    Integer localInteger1 = zzb(localJSONObject, "text_color");
    Integer localInteger2 = zzb(localJSONObject, "bg_color");
    int j = localJSONObject.optInt("animation_ms", 1000);
    int k = localJSONObject.optInt("presentation_ms", 4000);
    paramJSONObject = new ArrayList();
    if (localJSONObject.optJSONArray("images") != null) {
      paramJSONObject = zza(localJSONObject, "images", false, false, true);
    }
    for (;;)
    {
      return zzjf.zza(zzjf.zzl(paramJSONObject), new zzgw.4(this, str, localInteger2, localInteger1, i, k, j));
      paramJSONObject.add(zza(localJSONObject, "image", false, false));
    }
  }
  
  public zzif zzgl()
  {
    try
    {
      Object localObject1 = zzgm();
      Object localObject2 = zzb((zzed)localObject1);
      localObject2 = zza((zzed)localObject1, zze((JSONObject)localObject2), (JSONObject)localObject2);
      zza((zzh.zza)localObject2, (zzed)localObject1);
      localObject1 = zza((zzh.zza)localObject2);
      return (zzif)localObject1;
    }
    catch (JSONException localJSONException)
    {
      zzin.zzd("Malformed native JSON response.", localJSONException);
      if (!zzGJ) {
        zzF(0);
      }
      return zza(null);
    }
    catch (TimeoutException localTimeoutException)
    {
      for (;;)
      {
        zzin.zzd("Timeout when loading native ad.", localTimeoutException);
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
    catch (ExecutionException localExecutionException)
    {
      for (;;) {}
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
  }
  
  public boolean zzgn()
  {
    synchronized (zzpV)
    {
      boolean bool = zzGJ;
      return bool;
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzgw
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */