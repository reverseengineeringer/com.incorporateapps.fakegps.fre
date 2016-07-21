package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.app.DownloadManager.Request;
import android.content.Context;
import android.net.Uri;
import android.os.Environment;
import android.text.TextUtils;
import android.webkit.URLUtil;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfp
  extends zzfs
{
  private final Context mContext;
  private final Map zzxA;
  
  public zzfp(zzjp paramzzjp, Map paramMap)
  {
    super(paramzzjp, "storePicture");
    zzxA = paramMap;
    mContext = paramzzjp.zzhP();
  }
  
  public void execute()
  {
    if (mContext == null)
    {
      zzam("Activity context is not available");
      return;
    }
    if (!zzr.zzbC().zzM(mContext).zzdl())
    {
      zzam("Feature is not supported by the device.");
      return;
    }
    String str1 = (String)zzxA.get("iurl");
    if (TextUtils.isEmpty(str1))
    {
      zzam("Image url cannot be empty.");
      return;
    }
    if (!URLUtil.isValidUrl(str1))
    {
      zzam("Invalid image url: " + str1);
      return;
    }
    String str2 = zzal(str1);
    if (!zzr.zzbC().zzaE(str2))
    {
      zzam("Image type not recognized: " + str2);
      return;
    }
    AlertDialog.Builder localBuilder = zzr.zzbC().zzL(mContext);
    localBuilder.setTitle(zzr.zzbF().zzd(R.string.store_picture_title, "Save image"));
    localBuilder.setMessage(zzr.zzbF().zzd(R.string.store_picture_message, "Allow Ad to store image in Picture gallery?"));
    localBuilder.setPositiveButton(zzr.zzbF().zzd(R.string.accept, "Accept"), new zzfp.1(this, str1, str2));
    localBuilder.setNegativeButton(zzr.zzbF().zzd(R.string.decline, "Decline"), new zzfp.2(this));
    localBuilder.create().show();
  }
  
  String zzal(String paramString)
  {
    return Uri.parse(paramString).getLastPathSegment();
  }
  
  DownloadManager.Request zzf(String paramString1, String paramString2)
  {
    paramString1 = new DownloadManager.Request(Uri.parse(paramString1));
    paramString1.setDestinationInExternalPublicDir(Environment.DIRECTORY_PICTURES, paramString2);
    zzr.zzbE().zza(paramString1);
    return paramString1;
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfp
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */