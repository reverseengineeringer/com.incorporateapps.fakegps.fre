package com.google.android.gms.ads.internal;

import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import com.google.android.gms.ads.internal.formats.zzd;
import com.google.android.gms.internal.zzch;
import com.google.android.gms.internal.zzch.zza;
import com.google.android.gms.internal.zzdf;
import com.google.android.gms.internal.zzen;
import com.google.android.gms.internal.zzes;
import com.google.android.gms.internal.zzey;
import com.google.android.gms.internal.zzfb;
import com.google.android.gms.internal.zzfc;
import com.google.android.gms.internal.zzif;
import com.google.android.gms.internal.zzin;
import com.google.android.gms.internal.zzjp;
import com.google.android.gms.internal.zzjq;
import java.io.ByteArrayOutputStream;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import org.json.JSONObject;

public class zzm
{
  private static zzd zza(zzfb paramzzfb)
  {
    return new zzd(paramzzfb.getHeadline(), paramzzfb.getImages(), paramzzfb.getBody(), paramzzfb.zzdK(), paramzzfb.getCallToAction(), paramzzfb.getStarRating(), paramzzfb.getStore(), paramzzfb.getPrice(), null, paramzzfb.getExtras());
  }
  
  private static com.google.android.gms.ads.internal.formats.zze zza(zzfc paramzzfc)
  {
    return new com.google.android.gms.ads.internal.formats.zze(paramzzfc.getHeadline(), paramzzfc.getImages(), paramzzfc.getBody(), paramzzfc.zzdO(), paramzzfc.getCallToAction(), paramzzfc.getAdvertiser(), null, paramzzfc.getExtras());
  }
  
  static zzdf zza(zzfb paramzzfb, zzfc paramzzfc, zzf.zza paramzza)
  {
    return new zzm.5(paramzzfb, paramzza, paramzzfc);
  }
  
  static zzdf zza(CountDownLatch paramCountDownLatch)
  {
    return new zzm.3(paramCountDownLatch);
  }
  
  private static String zza(Bitmap paramBitmap)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    if (paramBitmap == null)
    {
      zzin.zzaK("Bitmap is null. Returning empty string");
      return "";
    }
    paramBitmap.compress(Bitmap.CompressFormat.PNG, 100, localByteArrayOutputStream);
    paramBitmap = Base64.encodeToString(localByteArrayOutputStream.toByteArray(), 0);
    return "data:image/png;base64," + paramBitmap;
  }
  
  static String zza(zzch paramzzch)
  {
    if (paramzzch == null)
    {
      zzin.zzaK("Image is null. Returning empty string");
      return "";
    }
    try
    {
      Object localObject = paramzzch.getUri();
      if (localObject != null)
      {
        localObject = ((Uri)localObject).toString();
        return (String)localObject;
      }
    }
    catch (RemoteException localRemoteException)
    {
      zzin.zzaK("Unable to get image uri. Trying data uri next");
    }
    return zzb(paramzzch);
  }
  
  private static JSONObject zza(Bundle paramBundle, String paramString)
  {
    JSONObject localJSONObject = new JSONObject();
    if ((paramBundle == null) || (TextUtils.isEmpty(paramString))) {
      return localJSONObject;
    }
    paramString = new JSONObject(paramString);
    Iterator localIterator = paramString.keys();
    while (localIterator.hasNext())
    {
      String str = (String)localIterator.next();
      if (paramBundle.containsKey(str)) {
        if ("image".equals(paramString.getString(str)))
        {
          Object localObject = paramBundle.get(str);
          if ((localObject instanceof Bitmap)) {
            localJSONObject.put(str, zza((Bitmap)localObject));
          } else {
            zzin.zzaK("Invalid type. An image type extra should return a bitmap");
          }
        }
        else if ((paramBundle.get(str) instanceof Bitmap))
        {
          zzin.zzaK("Invalid asset type. Bitmap should be returned only for image type");
        }
        else
        {
          localJSONObject.put(str, String.valueOf(paramBundle.get(str)));
        }
      }
    }
    return localJSONObject;
  }
  
  public static void zza(zzif paramzzif, zzf.zza paramzza)
  {
    zzjp localzzjp;
    View localView;
    if (zzg(paramzzif))
    {
      localzzjp = zzED;
      localView = localzzjp.getView();
      if (localView == null) {
        zzin.zzaK("AdWebView is null");
      }
    }
    else
    {
      return;
    }
    List localList;
    try
    {
      localList = zzCp.zzBM;
      if ((localList == null) || (localList.isEmpty()))
      {
        zzin.zzaK("No template ids present in mediation response");
        return;
      }
    }
    catch (RemoteException paramzzif)
    {
      zzin.zzd("Error occurred while recording impression and registering for clicks", paramzzif);
      return;
    }
    zzfb localzzfb = zzCq.zzeF();
    paramzzif = zzCq.zzeG();
    if ((localList.contains("2")) && (localzzfb != null))
    {
      localzzfb.zzd(com.google.android.gms.dynamic.zze.zzC(localView));
      if (!localzzfb.getOverrideImpressionRecording()) {
        localzzfb.recordImpression();
      }
      localzzjp.zzhU().zza("/nativeExpressViewClicked", zza(localzzfb, null, paramzza));
      return;
    }
    if ((localList.contains("1")) && (paramzzif != null))
    {
      paramzzif.zzd(com.google.android.gms.dynamic.zze.zzC(localView));
      if (!paramzzif.getOverrideImpressionRecording()) {
        paramzzif.recordImpression();
      }
      localzzjp.zzhU().zza("/nativeExpressViewClicked", zza(null, paramzzif, paramzza));
      return;
    }
    zzin.zzaK("No matching template id and mapper");
  }
  
  private static void zza(zzjp paramzzjp)
  {
    View.OnClickListener localOnClickListener = paramzzjp.zzif();
    if (localOnClickListener != null) {
      localOnClickListener.onClick(paramzzjp.getView());
    }
  }
  
  private static void zza(zzjp paramzzjp, zzd paramzzd, String paramString)
  {
    paramzzjp.zzhU().zza(new zzm.1(paramzzd, paramString, paramzzjp));
  }
  
  private static void zza(zzjp paramzzjp, com.google.android.gms.ads.internal.formats.zze paramzze, String paramString)
  {
    paramzzjp.zzhU().zza(new zzm.2(paramzze, paramString, paramzzjp));
  }
  
  private static void zza(zzjp paramzzjp, CountDownLatch paramCountDownLatch)
  {
    paramzzjp.zzhU().zza("/nativeExpressAssetsLoaded", zza(paramCountDownLatch));
    paramzzjp.zzhU().zza("/nativeExpressAssetsLoadingFailed", zzb(paramCountDownLatch));
  }
  
  public static boolean zza(zzjp paramzzjp, zzes paramzzes, CountDownLatch paramCountDownLatch)
  {
    boolean bool1 = false;
    try
    {
      boolean bool2 = zzb(paramzzjp, paramzzes, paramCountDownLatch);
      bool1 = bool2;
    }
    catch (RemoteException paramzzjp)
    {
      for (;;)
      {
        zzin.zzd("Unable to invoke load assets", paramzzjp);
      }
    }
    catch (RuntimeException paramzzjp)
    {
      paramCountDownLatch.countDown();
      throw paramzzjp;
    }
    if (!bool1) {
      paramCountDownLatch.countDown();
    }
    return bool1;
  }
  
  static zzdf zzb(CountDownLatch paramCountDownLatch)
  {
    return new zzm.4(paramCountDownLatch);
  }
  
  private static String zzb(zzch paramzzch)
  {
    try
    {
      paramzzch = paramzzch.zzdJ();
      if (paramzzch == null)
      {
        zzin.zzaK("Drawable is null. Returning empty string");
        return "";
      }
      paramzzch = (Drawable)com.google.android.gms.dynamic.zze.zzp(paramzzch);
      if (!(paramzzch instanceof BitmapDrawable))
      {
        zzin.zzaK("Drawable is not an instance of BitmapDrawable. Returning empty string");
        return "";
      }
    }
    catch (RemoteException paramzzch)
    {
      zzin.zzaK("Unable to get drawable. Returning empty string");
      return "";
    }
    return zza(((BitmapDrawable)paramzzch).getBitmap());
  }
  
  private static boolean zzb(zzjp paramzzjp, zzes paramzzes, CountDownLatch paramCountDownLatch)
  {
    Object localObject = paramzzjp.getView();
    if (localObject == null)
    {
      zzin.zzaK("AdWebView is null");
      return false;
    }
    ((View)localObject).setVisibility(4);
    localObject = zzCp.zzBM;
    if ((localObject == null) || (((List)localObject).isEmpty()))
    {
      zzin.zzaK("No template ids present in mediation response");
      return false;
    }
    zza(paramzzjp, paramCountDownLatch);
    paramCountDownLatch = zzCq.zzeF();
    zzfc localzzfc = zzCq.zzeG();
    if ((((List)localObject).contains("2")) && (paramCountDownLatch != null))
    {
      zza(paramzzjp, zza(paramCountDownLatch), zzCp.zzBL);
      paramCountDownLatch = zzCp.zzBJ;
      paramzzes = zzCp.zzBK;
      if (paramzzes == null) {
        break label189;
      }
      paramzzjp.loadDataWithBaseURL(paramzzes, paramCountDownLatch, "text/html", "UTF-8", null);
    }
    for (;;)
    {
      return true;
      if ((((List)localObject).contains("1")) && (localzzfc != null))
      {
        zza(paramzzjp, zza(localzzfc), zzCp.zzBL);
        break;
      }
      zzin.zzaK("No matching template id and mapper");
      return false;
      label189:
      paramzzjp.loadData(paramCountDownLatch, "text/html", "UTF-8");
    }
  }
  
  private static zzch zzc(Object paramObject)
  {
    if ((paramObject instanceof IBinder)) {
      return zzch.zza.zzt((IBinder)paramObject);
    }
    return null;
  }
  
  public static View zzf(zzif paramzzif)
  {
    if (paramzzif == null)
    {
      zzin.e("AdState is null");
      return null;
    }
    if (zzg(paramzzif)) {
      return zzED.getView();
    }
    try
    {
      paramzzif = zzCq.getView();
      if (paramzzif == null)
      {
        zzin.zzaK("View in mediation adapter is null.");
        return null;
      }
      paramzzif = (View)com.google.android.gms.dynamic.zze.zzp(paramzzif);
      return paramzzif;
    }
    catch (RemoteException paramzzif)
    {
      zzin.zzd("Could not get View from mediation adapter.", paramzzif);
    }
    return null;
  }
  
  public static boolean zzg(zzif paramzzif)
  {
    return (paramzzif != null) && (zzHT) && (zzCp != null) && (zzCp.zzBJ != null);
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.ads.internal.zzm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */