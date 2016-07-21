package android.support.v4.app;

import java.util.ArrayList;

public class NotificationCompat$InboxStyle
  extends NotificationCompat.Style
{
  ArrayList mTexts = new ArrayList();
  
  public NotificationCompat$InboxStyle() {}
  
  public NotificationCompat$InboxStyle(NotificationCompat.Builder paramBuilder)
  {
    setBuilder(paramBuilder);
  }
  
  public InboxStyle addLine(CharSequence paramCharSequence)
  {
    mTexts.add(paramCharSequence);
    return this;
  }
  
  public InboxStyle setBigContentTitle(CharSequence paramCharSequence)
  {
    mBigContentTitle = paramCharSequence;
    return this;
  }
  
  public InboxStyle setSummaryText(CharSequence paramCharSequence)
  {
    mSummaryText = paramCharSequence;
    mSummaryTextSet = true;
    return this;
  }
}

/* Location:
 * Qualified Name:     android.support.v4.app.NotificationCompat.InboxStyle
 * Java Class Version: 6 (50.0)
 * JD-Core Version:    0.7.1
 */