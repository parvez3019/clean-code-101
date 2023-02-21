package com.olx;

public class EarlyReturn {

    public static String renderPageWithSetupAndTeardowns(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute("Test");
        if (isTestPage) {
            WikiPage testPage = pageData.getWikiPage();
            StringBuffer newPageContent = new StringBuffer();
            includeSetupPages(testPage, newPageContent, isSuite);
            newPageContent.append(pageData.getContent());
            includeTeardownPages(testPage, newPageContent, isSuite);
            pageData.setContent(newPageContent.toString());
        }
        return pageData.getHtml();
    }

    public static String renderPageWithSetupAndTeardowns(
            PageData pageData, boolean isSuite
    ) throws Exception {
        boolean isTestPage = pageData.hasAttribute("Test");
        // Early return
        if (!isTestPage) {
            return pageData.getHtml();
        }
        WikiPage testPage = pageData.getWikiPage();
        StringBuffer newPageContent = new StringBuffer();
        includeSetupPages(testPage, newPageContent, isSuite);
        newPageContent.append(pageData.getContent());
        includeTeardownPages(testPage, newPageContent, isSuite);
        pageData.setContent(newPageContent.toString());
        return pageData.toString();
    }

    public static String renderPageWithSetupAndTeardowns(
            PageData pageData, boolean isSuite
    ) throws Exception {
        if (!pageData.hasAttribute("Test")) {
            return pageData.getHtml();
        }
        return includeSetupAndTeardownPages(pageData, isSuite);
    }

}
