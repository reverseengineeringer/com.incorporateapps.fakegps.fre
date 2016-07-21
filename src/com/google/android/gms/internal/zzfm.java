package com.google.android.gms.internal;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.content.Context;
import android.content.Intent;
import android.provider.CalendarContract.Events;
import android.text.TextUtils;
import com.google.android.gms.R.string;
import com.google.android.gms.ads.internal.zzr;
import java.util.Map;

public class zzfm
  extends zzfs
{
  private final Context mContext;
  private String zzCU;
  private long zzCV;
  private long zzCW;
  private String zzCX;
  private String zzCY;
  private final Map zzxA;
  
  public zzfm(zzjp paramzzjp, Map paramMap)
  {
    super(paramzzjp, "createCalendarEvent");
    zzxA = paramMap;
    mContext = paramzzjp.zzhP();
    zzeK();
  }
  
  private String zzaj(String paramString)
  {
    if (TextUtils.isEmpty((CharSequence)zzxA.get(paramString))) {
      return "";
    }
    return (String)zzxA.get(paramString);
  }
  
  private long zzak(String paramString)
  {
    paramString = (String)zzxA.get(paramString);
    if (paramString == null) {
      return -1L;
    }
    try
    {
      long l = Long.parseLong(paramString);
      return l;
    }
    catch (NumberFormatException paramString) {}
    return -1L;
  }
  
  private void zzeK()
  {
    zzCU = zzaj("description");
    zzCX = zzaj("summary");
    zzCV = zzak("start_ticks");
    zzCW = zzak("end_ticks");
    zzCY = zzaj("location");
  }
  
  Intent createIntent()
  {
    Intent localIntent = new Intent("android.intent.action.EDIT").setData(CalendarContract.Events.CONTENT_URI);
    localIntent.putExtra("title", zzCU);
    localIntent.putExtra("eventLocation", zzCY);
    localIntent.putExtra("description", zzCX);
    if (zzCV > -1L) {
      localIntent.putExtra("beginTime", zzCV);
    }
    if (zzCW > -1L) {
      localIntent.putExtra("endTime", zzCW);
    }
    localIntent.setFlags(268435456);
    return localIntent;
  }
  
  public void execute()
  {
    if (mContext == null)
    {
      zzam("Activity context is not available.");
      return;
    }
    if (!zzr.zzbC().zzM(mContext).zzdo())
    {
      zzam("This feature is not available on the device.");
      return;
    }
    AlertDialog.Builder localBuilder = zzr.zzbC().zzL(mContext);
    localBuilder.setTitle(zzr.zzbF().zzd(R.string.create_calendar_title, "Create calendar event"));
    localBuilder.setMessage(zzr.zzbF().zzd(R.string.create_calendar_message, "Allow Ad to create a calendar event?"));
    localBuilder.setPositiveButton(zzr.zzbF().zzd(R.string.accept, "Accept"), new zzfm.1(this));
    localBuilder.setNegativeButton(zzr.zzbF().zzd(R.string.decline, "Decline"), new zzfm.2(this));
    localBuilder.create().show();
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzfm
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */