package com.google.android.gms.internal;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import org.json.JSONObject;

public class zzga
  extends Handler
{
  private final zzfz zzFq;
  
  public zzga(Context paramContext)
  {
    this(new zzgb(localContext));
  }
  
  public zzga(zzfz paramzzfz)
  {
    zzFq = paramzzfz;
  }
  
  private void zzd(JSONObject paramJSONObject)
  {
    try
    {
      zzFq.zza(paramJSONObject.getString("request_id"), paramJSONObject.getString("base_url"), paramJSONObject.getString("html"));
      return;
    }
    catch (Exception paramJSONObject) {}
  }
  
  public void handleMessage(Message paramMessage)
  {
    try
    {
      paramMessage = paramMessage.getData();
      if (paramMessage == null) {
        return;
      }
      paramMessage = new JSONObject(paramMessage.getString("data"));
      if ("fetch_html".equals(paramMessage.getString("message_name")))
      {
        zzd(paramMessage);
        return;
      }
    }
    catch (Exception paramMessage) {}
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.internal.zzga
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */