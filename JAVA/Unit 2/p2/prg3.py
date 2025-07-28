import cv2

img = cv2.imread("pspk.png",-1)

print(img)

cv2.imshow("Output", img)

cv2.waitKey(5000)
cv2.destroyAllWindows()

cv2.imwrite("pspk.png",img)

