package com.google.android.gms.cast;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.view.accessibility.CaptioningManager;
import android.view.accessibility.CaptioningManager.CaptionStyle;
import com.google.android.gms.cast.internal.zzf;
import com.google.android.gms.common.internal.zzw;
import com.google.android.gms.internal.zznb;
import com.google.android.gms.internal.zzne;
import org.json.JSONException;
import org.json.JSONObject;

public final class TextTrackStyle
{
  public static final int COLOR_UNSPECIFIED = 0;
  public static final float DEFAULT_FONT_SCALE = 1.0F;
  public static final int EDGE_TYPE_DEPRESSED = 4;
  public static final int EDGE_TYPE_DROP_SHADOW = 2;
  public static final int EDGE_TYPE_NONE = 0;
  public static final int EDGE_TYPE_OUTLINE = 1;
  public static final int EDGE_TYPE_RAISED = 3;
  public static final int EDGE_TYPE_UNSPECIFIED = -1;
  public static final int FONT_FAMILY_CASUAL = 4;
  public static final int FONT_FAMILY_CURSIVE = 5;
  public static final int FONT_FAMILY_MONOSPACED_SANS_SERIF = 1;
  public static final int FONT_FAMILY_MONOSPACED_SERIF = 3;
  public static final int FONT_FAMILY_SANS_SERIF = 0;
  public static final int FONT_FAMILY_SERIF = 2;
  public static final int FONT_FAMILY_SMALL_CAPITALS = 6;
  public static final int FONT_FAMILY_UNSPECIFIED = -1;
  public static final int FONT_STYLE_BOLD = 1;
  public static final int FONT_STYLE_BOLD_ITALIC = 3;
  public static final int FONT_STYLE_ITALIC = 2;
  public static final int FONT_STYLE_NORMAL = 0;
  public static final int FONT_STYLE_UNSPECIFIED = -1;
  public static final int WINDOW_TYPE_NONE = 0;
  public static final int WINDOW_TYPE_NORMAL = 1;
  public static final int WINDOW_TYPE_ROUNDED = 2;
  public static final int WINDOW_TYPE_UNSPECIFIED = -1;
  private JSONObject zzaaU;
  private float zzaco;
  private int zzacp;
  private int zzacq;
  private int zzacr;
  private int zzacs;
  private int zzact;
  private int zzacu;
  private String zzacv;
  private int zzacw;
  private int zzacx;
  private int zzxO;
  
  public TextTrackStyle()
  {
    clear();
  }
  
  private void clear()
  {
    zzaco = 1.0F;
    zzacp = 0;
    zzxO = 0;
    zzacq = -1;
    zzacr = 0;
    zzacs = -1;
    zzact = 0;
    zzacu = 0;
    zzacv = null;
    zzacw = -1;
    zzacx = -1;
    zzaaU = null;
  }
  
  public static TextTrackStyle fromSystemSettings(Context paramContext)
  {
    TextTrackStyle localTextTrackStyle = new TextTrackStyle();
    if (!zzne.zzsk()) {
      return localTextTrackStyle;
    }
    paramContext = (CaptioningManager)paramContext.getSystemService("captioning");
    zzaco = paramContext.getFontScale();
    paramContext = paramContext.getUserStyle();
    zzxO = backgroundColor;
    zzacp = foregroundColor;
    label117:
    boolean bool1;
    boolean bool2;
    switch (edgeType)
    {
    default: 
      localTextTrackStyle.setEdgeType(0);
      zzacr = edgeColor;
      paramContext = paramContext.getTypeface();
      if (paramContext != null)
      {
        if (!Typeface.MONOSPACE.equals(paramContext)) {
          break label158;
        }
        localTextTrackStyle.setFontGenericFamily(1);
        bool1 = paramContext.isBold();
        bool2 = paramContext.isItalic();
        if ((!bool1) || (!bool2)) {
          break label194;
        }
        localTextTrackStyle.setFontStyle(3);
      }
      break;
    }
    for (;;)
    {
      return localTextTrackStyle;
      localTextTrackStyle.setEdgeType(1);
      break;
      localTextTrackStyle.setEdgeType(2);
      break;
      label158:
      if ((!Typeface.SANS_SERIF.equals(paramContext)) && (Typeface.SERIF.equals(paramContext)))
      {
        localTextTrackStyle.setFontGenericFamily(2);
        break label117;
      }
      localTextTrackStyle.setFontGenericFamily(0);
      break label117;
      label194:
      if (bool1) {
        localTextTrackStyle.setFontStyle(1);
      } else if (bool2) {
        localTextTrackStyle.setFontStyle(2);
      } else {
        localTextTrackStyle.setFontStyle(0);
      }
    }
  }
  
  private String zzL(int paramInt)
  {
    return String.format("#%02X%02X%02X%02X", new Object[] { Integer.valueOf(Color.red(paramInt)), Integer.valueOf(Color.green(paramInt)), Integer.valueOf(Color.blue(paramInt)), Integer.valueOf(Color.alpha(paramInt)) });
  }
  
  private int zzcd(String paramString)
  {
    int j = 0;
    int i = j;
    if (paramString != null)
    {
      i = j;
      if (paramString.length() == 9)
      {
        i = j;
        if (paramString.charAt(0) != '#') {}
      }
    }
    try
    {
      i = Integer.parseInt(paramString.substring(1, 3), 16);
      j = Integer.parseInt(paramString.substring(3, 5), 16);
      int k = Integer.parseInt(paramString.substring(5, 7), 16);
      i = Color.argb(Integer.parseInt(paramString.substring(7, 9), 16), i, j, k);
      return i;
    }
    catch (NumberFormatException paramString) {}
    return 0;
  }
  
  public final boolean equals(Object paramObject)
  {
    boolean bool2 = false;
    boolean bool1;
    if (this == paramObject) {
      bool1 = true;
    }
    do
    {
      return bool1;
      bool1 = bool2;
    } while (!(paramObject instanceof TextTrackStyle));
    paramObject = (TextTrackStyle)paramObject;
    int i;
    if (zzaaU == null)
    {
      i = 1;
      label39:
      if (zzaaU != null) {
        break label250;
      }
    }
    label250:
    for (int j = 1;; j = 0)
    {
      bool1 = bool2;
      if (i != j) {
        break;
      }
      if ((zzaaU != null) && (zzaaU != null))
      {
        bool1 = bool2;
        if (!zznb.zze(zzaaU, zzaaU)) {
          break;
        }
      }
      bool1 = bool2;
      if (zzaco != zzaco) {
        break;
      }
      bool1 = bool2;
      if (zzacp != zzacp) {
        break;
      }
      bool1 = bool2;
      if (zzxO != zzxO) {
        break;
      }
      bool1 = bool2;
      if (zzacq != zzacq) {
        break;
      }
      bool1 = bool2;
      if (zzacr != zzacr) {
        break;
      }
      bool1 = bool2;
      if (zzacs != zzacs) {
        break;
      }
      bool1 = bool2;
      if (zzacu != zzacu) {
        break;
      }
      bool1 = bool2;
      if (!zzf.zza(zzacv, zzacv)) {
        break;
      }
      bool1 = bool2;
      if (zzacw != zzacw) {
        break;
      }
      bool1 = bool2;
      if (zzacx != zzacx) {
        break;
      }
      return true;
      i = 0;
      break label39;
    }
  }
  
  public final int getBackgroundColor()
  {
    return zzxO;
  }
  
  public final JSONObject getCustomData()
  {
    return zzaaU;
  }
  
  public final int getEdgeColor()
  {
    return zzacr;
  }
  
  public final int getEdgeType()
  {
    return zzacq;
  }
  
  public final String getFontFamily()
  {
    return zzacv;
  }
  
  public final int getFontGenericFamily()
  {
    return zzacw;
  }
  
  public final float getFontScale()
  {
    return zzaco;
  }
  
  public final int getFontStyle()
  {
    return zzacx;
  }
  
  public final int getForegroundColor()
  {
    return zzacp;
  }
  
  public final int getWindowColor()
  {
    return zzact;
  }
  
  public final int getWindowCornerRadius()
  {
    return zzacu;
  }
  
  public final int getWindowType()
  {
    return zzacs;
  }
  
  public final int hashCode()
  {
    return zzw.hashCode(new Object[] { Float.valueOf(zzaco), Integer.valueOf(zzacp), Integer.valueOf(zzxO), Integer.valueOf(zzacq), Integer.valueOf(zzacr), Integer.valueOf(zzacs), Integer.valueOf(zzact), Integer.valueOf(zzacu), zzacv, Integer.valueOf(zzacw), Integer.valueOf(zzacx), zzaaU });
  }
  
  public final void setBackgroundColor(int paramInt)
  {
    zzxO = paramInt;
  }
  
  public final void setCustomData(JSONObject paramJSONObject)
  {
    zzaaU = paramJSONObject;
  }
  
  public final void setEdgeColor(int paramInt)
  {
    zzacr = paramInt;
  }
  
  public final void setEdgeType(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 4)) {
      throw new IllegalArgumentException("invalid edgeType");
    }
    zzacq = paramInt;
  }
  
  public final void setFontFamily(String paramString)
  {
    zzacv = paramString;
  }
  
  public final void setFontGenericFamily(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 6)) {
      throw new IllegalArgumentException("invalid fontGenericFamily");
    }
    zzacw = paramInt;
  }
  
  public final void setFontScale(float paramFloat)
  {
    zzaco = paramFloat;
  }
  
  public final void setFontStyle(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 3)) {
      throw new IllegalArgumentException("invalid fontStyle");
    }
    zzacx = paramInt;
  }
  
  public final void setForegroundColor(int paramInt)
  {
    zzacp = paramInt;
  }
  
  public final void setWindowColor(int paramInt)
  {
    zzact = paramInt;
  }
  
  public final void setWindowCornerRadius(int paramInt)
  {
    if (paramInt < 0) {
      throw new IllegalArgumentException("invalid windowCornerRadius");
    }
    zzacu = paramInt;
  }
  
  public final void setWindowType(int paramInt)
  {
    if ((paramInt < 0) || (paramInt > 2)) {
      throw new IllegalArgumentException("invalid windowType");
    }
    zzacs = paramInt;
  }
  
  public final JSONObject toJson()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("fontScale", zzaco);
      if (zzacp != 0) {
        localJSONObject.put("foregroundColor", zzL(zzacp));
      }
      if (zzxO != 0) {
        localJSONObject.put("backgroundColor", zzL(zzxO));
      }
      switch (zzacq)
      {
      case 0: 
        if (zzacr != 0) {
          localJSONObject.put("edgeColor", zzL(zzacr));
        }
        switch (zzacs)
        {
        case 0: 
          label156:
          if (zzact != 0) {
            localJSONObject.put("windowColor", zzL(zzact));
          }
          if (zzacs == 2) {
            localJSONObject.put("windowRoundedCornerRadius", zzacu);
          }
          if (zzacv != null) {
            localJSONObject.put("fontFamily", zzacv);
          }
          switch (zzacw)
          {
          case 0: 
            label264:
            switch (zzacx)
            {
            }
            break;
          }
          break;
        }
        break;
      }
      for (;;)
      {
        if (zzaaU == null) {
          break label599;
        }
        localJSONObject.put("customData", zzaaU);
        return localJSONObject;
        localJSONObject.put("edgeType", "NONE");
        break;
        localJSONObject.put("edgeType", "OUTLINE");
        break;
        localJSONObject.put("edgeType", "DROP_SHADOW");
        break;
        localJSONObject.put("edgeType", "RAISED");
        break;
        localJSONObject.put("edgeType", "DEPRESSED");
        break;
        localJSONObject.put("windowType", "NONE");
        break label156;
        localJSONObject.put("windowType", "NORMAL");
        break label156;
        localJSONObject.put("windowType", "ROUNDED_CORNERS");
        break label156;
        localJSONObject.put("fontGenericFamily", "SANS_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SANS_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "MONOSPACED_SERIF");
        break label264;
        localJSONObject.put("fontGenericFamily", "CASUAL");
        break label264;
        localJSONObject.put("fontGenericFamily", "CURSIVE");
        break label264;
        localJSONObject.put("fontGenericFamily", "SMALL_CAPITALS");
        break label264;
        localJSONObject.put("fontStyle", "NORMAL");
        continue;
        localJSONObject.put("fontStyle", "BOLD");
        continue;
        localJSONObject.put("fontStyle", "ITALIC");
        continue;
        localJSONObject.put("fontStyle", "BOLD_ITALIC");
        continue;
        break;
        break label156;
        break label264;
      }
      label599:
      return localJSONObject;
    }
    catch (JSONException localJSONException) {}
    return localJSONObject;
  }
  
  public final void zzg(JSONObject paramJSONObject)
  {
    clear();
    zzaco = ((float)paramJSONObject.optDouble("fontScale", 1.0D));
    zzacp = zzcd(paramJSONObject.optString("foregroundColor"));
    zzxO = zzcd(paramJSONObject.optString("backgroundColor"));
    String str;
    if (paramJSONObject.has("edgeType"))
    {
      str = paramJSONObject.getString("edgeType");
      if ("NONE".equals(str)) {
        zzacq = 0;
      }
    }
    else
    {
      zzacr = zzcd(paramJSONObject.optString("edgeColor"));
      if (paramJSONObject.has("windowType"))
      {
        str = paramJSONObject.getString("windowType");
        if (!"NONE".equals(str)) {
          break label325;
        }
        zzacs = 0;
      }
      label128:
      zzact = zzcd(paramJSONObject.optString("windowColor"));
      if (zzacs == 2) {
        zzacu = paramJSONObject.optInt("windowRoundedCornerRadius", 0);
      }
      zzacv = paramJSONObject.optString("fontFamily", null);
      if (paramJSONObject.has("fontGenericFamily"))
      {
        str = paramJSONObject.getString("fontGenericFamily");
        if (!"SANS_SERIF".equals(str)) {
          break label361;
        }
        zzacw = 0;
      }
      label208:
      if (paramJSONObject.has("fontStyle"))
      {
        str = paramJSONObject.getString("fontStyle");
        if (!"NORMAL".equals(str)) {
          break label470;
        }
        zzacx = 0;
      }
    }
    for (;;)
    {
      zzaaU = paramJSONObject.optJSONObject("customData");
      return;
      if ("OUTLINE".equals(str))
      {
        zzacq = 1;
        break;
      }
      if ("DROP_SHADOW".equals(str))
      {
        zzacq = 2;
        break;
      }
      if ("RAISED".equals(str))
      {
        zzacq = 3;
        break;
      }
      if (!"DEPRESSED".equals(str)) {
        break;
      }
      zzacq = 4;
      break;
      label325:
      if ("NORMAL".equals(str))
      {
        zzacs = 1;
        break label128;
      }
      if (!"ROUNDED_CORNERS".equals(str)) {
        break label128;
      }
      zzacs = 2;
      break label128;
      label361:
      if ("MONOSPACED_SANS_SERIF".equals(str))
      {
        zzacw = 1;
        break label208;
      }
      if ("SERIF".equals(str))
      {
        zzacw = 2;
        break label208;
      }
      if ("MONOSPACED_SERIF".equals(str))
      {
        zzacw = 3;
        break label208;
      }
      if ("CASUAL".equals(str))
      {
        zzacw = 4;
        break label208;
      }
      if ("CURSIVE".equals(str))
      {
        zzacw = 5;
        break label208;
      }
      if (!"SMALL_CAPITALS".equals(str)) {
        break label208;
      }
      zzacw = 6;
      break label208;
      label470:
      if ("BOLD".equals(str)) {
        zzacx = 1;
      } else if ("ITALIC".equals(str)) {
        zzacx = 2;
      } else if ("BOLD_ITALIC".equals(str)) {
        zzacx = 3;
      }
    }
  }
}

/* Location:
 * Qualified Name:     com.google.android.gms.cast.TextTrackStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */